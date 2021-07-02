package javapractice.interfaces;

public class Tennis implements Sports{

	public void winner() {
		System.out.println("Wins more sets is a winner");
	}

	@Override
	public void tie() {
		System.out.println("No chance of Tie");
	}

	public void greet(String greetings) {
		System.out.println("Say " + greetings);
	}

	public boolean isOlympicSport() {
		return Sports.IS_OLYMPIC_SPORT;
	}
	
	@Override
	public void typeOfSport() {
		System.out.println("Its an individual Sport");
	}

}
