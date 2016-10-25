
public abstract class Player {
	protected String name;
	protected Roshambo choice;

	public abstract Roshambo generateRoshambo();

	public Roshambo getChoice() {
		return choice;
	}

	public String getName() {
		return name;
	}
}

