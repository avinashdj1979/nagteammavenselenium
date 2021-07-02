package javapractice.interfaces;

public class Main {

	public static void main(String[] args) {
		Sports cricket = new Cricket();
		Sports tennis = new Tennis();
		
		cricket.winner();
		tennis.winner();
		
		cricket.typeOfSport();
		tennis.typeOfSport();
		
		System.out.println(Sports.audienceAllowed());
	}

}
