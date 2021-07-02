package javapractice.interfaces;

public interface Sports {
	
	public static final boolean IS_OLYMPIC_SPORT = true;
	boolean IS_NOT_OLYMPIC_SPORT = false;
	
	public static final int AUDIENCE_ALLOWED = 50;
	
	public void winner();
	
	public void tie();
	
	public void greet(String greetings);
	
	public boolean isOlympicSport();
	
	default void typeOfSport() {
		System.out.println("Its a team sport");
	}

	static int audienceAllowed() {
		return AUDIENCE_ALLOWED;
	}

}
