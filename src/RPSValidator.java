
public class RPSValidator {
	public static int isValidPlay (String choice) {
		choice = choice.toLowerCase().substring(0, 1);
		if (choice.equals("r"))
			return 0;
		if (choice.equals("p"))
			return 1;
		if (choice.equals("s"))
			return 2;
		return -1;
	}
	
	public static int isValidOpponent (String choice) {
		choice = choice.toLowerCase().substring(0, 1);
		if (choice.equals("s"))
			return 0;
		if (choice.equals("j"))
			return 1;
		return -1;
	}
	
	public static boolean isYN (String s) {
		return (s.toUpperCase().charAt(0)=='Y' || s.toUpperCase().charAt(0)=='N');
	}

}
