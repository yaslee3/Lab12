//enumeration that store three value:rock, paper, and scissors
public  enum Roshambo {
	ROCK, PAPER, SCISSORS;

	@Override
	//a toString method that can convert the selected value to a String
	public String toString() {
		if (ordinal() == 0)
			return "Rock";
		if (ordinal() == 1)
			return "Paper";
		return "Scissors";	
		
	}
	public static int decideWinner(Roshambo p1, Roshambo p2) {
		if (p1 == p2)
			return 0; // tie
		if (p1 == Roshambo.ROCK && p2 == Roshambo.SCISSORS)
			return 1;
		if (p1 == Roshambo.PAPER && p2 == Roshambo.ROCK)
			return 1;
		if (p1 == Roshambo.SCISSORS && p2 == Roshambo.PAPER)
			return 1;
		return 2;
	}

}
