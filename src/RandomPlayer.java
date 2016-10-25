
public class RandomPlayer extends Player {

	public RandomPlayer() {
		name = "Random Player";
	}

	@Override
	public Roshambo generateRoshambo() {
		int n = (int) (Math.random() * 3);
		if (n == 0) {
			choice = Roshambo.ROCK;
		} else if (n == 1) {
			choice = Roshambo.PAPER;
		} else {
			choice = Roshambo.SCISSORS;
		}
		return choice;

}
}