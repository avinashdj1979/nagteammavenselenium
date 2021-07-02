package javapractice.interfaces;

public class Cricket implements Sports{

	public void winner() {
		System.out.println("Team scoring more runs");
	}

	public void tie() {
		System.out.println("If teams scores are level");
	}

	public void greet(String greetings) {
		System.out.println("Greet with " + greetings);
	}

	public boolean isOlympicSport() {
		return Sports.IS_NOT_OLYMPIC_SPORT;
	}
}
