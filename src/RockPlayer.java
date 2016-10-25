
public class RockPlayer extends Player {
         public RockPlayer() {
			name = "Rock Player";
		}

		@Override
		public Roshambo generateRoshambo() {
			choice = Roshambo.ROCK;
			return choice;
}
}