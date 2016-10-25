import java.util.Scanner;

public class RoshamboGameRPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Welcome to Grand Circus Rock/Paper/Scissors!");
		
		Player player1 = new HumanPlayer (scan);
		Player opponent;
		System.out.print("Would you like to play against TheJets or TheSharks? (J/S)");
		String choice = scan.nextLine();
		int c = RPSValidator.isValidOpponent(choice);
		while (c < 0) {
			System.out.println("Sorry, that's not a valid choice.");
			System.out.print("Would you like to play against TheJets or TheSharks? (J/S) ");
			choice = scan.nextLine();
			c = RPSValidator.isValidOpponent(choice);
		}

			if (c == 0)
				opponent = new RockPlayer();
			else
				opponent = new RandomPlayer();

			int games = 0;
			int wins = 0;
			int ties = 0;
			
			while (true) {
				games++;
				player1.generateRoshambo();
				opponent.generateRoshambo();
				
				System.out.println();
				System.out.println(player1.getName() + ": " + player1.getChoice());
				System.out.println(opponent.getName() + ": " + opponent.getChoice());
				
				int winner = Roshambo.decideWinner(player1.getChoice(), opponent.getChoice());
				if (winner == 0) {
					System.out.println("Players tied!");
					ties++;
				} else if (winner == 1) {
					System.out.println(player1.getName() + " wins!");
					wins++;
				} else {
					System.out.println(opponent.getName() + " wins!");
				}

				System.out.println();

				System.out.print("Continue? (y/n) ");
				String answer = scan.nextLine();
				char firstLetter = answer.toUpperCase().charAt(0);
				while (!RPSValidator.isYN(answer)) {
					System.out.print("Invalid entry.  Please try again.  Continue? (y/n) ");
					answer = scan.nextLine();
				}
				if (firstLetter == 'N')
					break;
			}
			System.out.println("Thanks for playing! You won " + wins + " and tied " + ties + " times out of " + games);
			scan.close();

		}


	}


