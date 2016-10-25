import java.util.Scanner;

public class HumanPlayer extends Player {
Scanner scan;
	public HumanPlayer(Scanner s) {
		// TODO Auto-generated constructor stub
		
		scan = s;
		System.out.print("Enter your name: ");
		name = scan.nextLine();
	}
		@Override
		public Roshambo generateRoshambo() {
			System.out.print("Rock, paper, or scissors? (R/P/S)");
			String input = scan.nextLine();
			int n = RPSValidator.isValidPlay(input);
			
			while (n < 0) {
				System.out.println("Sorry, that's not a valid choice.");
				System.out.print("Rock, paper, or scissors? (R/P/S)");
				input = scan.nextLine();
				n = RPSValidator.isValidPlay(input);
			}
			if (n == 0)
				choice = Roshambo.ROCK;
			else if (n == 1)
				choice = Roshambo.PAPER;
			else if (n == 2)
				choice = Roshambo.SCISSORS;
			
			return choice;

	}

}
