package javapractice.inheritance;

public class American extends Person{
	//Indian is a Person
	
	private String ssn;
	
	public American(String name, int age, String aadhaar) {
		super(name, age);
		this.ssn = ssn;
	}
	
	public American() {
		//super();
		this("New Born", 0, "NA");
		//Indian(a,b,c)
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public void eats() {
		System.out.println(String.format("%s eats Continental Food and his age is %d", getName(), getAge()));
	}
	
}
