package javapractice.inheritance;

public class Citizen {

	public static void main(String[] args) {
		
		Person indian = new Indian("Nikhil", 18, "AHHGSHSHS");// super class reference variable can point to a sub class object
		
		Person american = new American("John", 18, "AHHGSHSHS");
		
		indian.eats();
		
		american.eats();
		
     	//Indian ind1 = new Person("Person1", 24);  // sub class reference variable cannot point to a super class object
	
		//ind1.canVote();
		
		//indian.canVote();
		
		//Compile time type of indian is Person
		//Runtime type of indian in Indian
		
		
		//has a
//		Indian indian1; //reference
//		
//		indian1 = new Indian("Azhar", 56, "435355678");
//		
//		Indian indian2 = new Indian();
//		
//		System.out.println(new Indian("Kapil", 56, "343434").getName());
//
//		System.out.println(indian1.getName());
//		System.out.println(indian1.getAge());
//		System.out.println(indian1.getAadhaar());
//		
//		Indian indian3;
//		
//		indian3 = indian1;
//		
//		System.out.println("After Indian 3 assignment");
//		System.out.println(indian1.getName());
//		System.out.println(indian1.getAge());
//		System.out.println(indian1.getAadhaar());
//		
//		indian1 = null;
//		
//		System.out.println(indian3.getName());
//		System.out.println(indian3.getAge());
//		System.out.println(indian3.getAadhaar());
//		
//		indian3 = indian2;
//		
//		indian1 = indian3;
//		
//		System.out.println(indian1.getName());
//		System.out.println(indian1.getAge());
//		System.out.println(indian1.getAadhaar());
		
		//has a
		
//		Person kumar;
//		kumar = new Person();
//		
//		Person gautam = new Person();
//		gautam.setName("Gautam");
//		gautam.setAge(40);
//		
//		kumar.setName("Rajeev kumar");
//		kumar.setAge(20);
//		
//		System.out.println(gautam.getAge());
//		System.out.println(gautam.getName());
//		System.out.println(kumar.getAge());
//
//		kumar.eats();
//		
//		gautam.eats();
		
//		Person radha = new Person("Radha", 32);
//		radha.incrementCounter();
//		Person sachin = new Person("Sachin", 56);
//		sachin.incrementCounter();
//		//Person.getName();
//		
//		System.out.println(radha.getName());
//		radha.setName("Radhe");
//		System.out.println(radha.getName());
//		System.out.println(sachin.getAge());
//		
//		System.out.println(Person.getCounter());
	}

}
