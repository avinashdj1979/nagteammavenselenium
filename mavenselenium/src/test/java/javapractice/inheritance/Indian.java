package javapractice.inheritance;

public class Indian extends Person{
	//Indian is a Person
	
	private String aadhaar;
	
	public Indian(String name, int age, String aadhaar) {
		super(name, age);
		this.aadhaar = aadhaar;
	}
	
	public Indian() {
		//super();
		this("New Born", 0, "NA");
		//Indian(a,b,c)
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	
	@Override
	public void eats() {
		System.out.println(String.format("%s eats Indian based Food and his age is %d", getName(), getAge()));
	}
	
	
	public void canVote() {
		if (getAge() >= 18) {
			System.out.println("Can vote");
		} else {
			System.out.println("Cannot vote");
		}
	}
}
