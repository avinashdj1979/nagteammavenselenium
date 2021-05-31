package javapractice;

public class Citizen {

	public static void main(String[] args) {
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
		
		Person radha = new Person("Radha", 32);
		radha.incrementCounter();
		Person sachin = new Person("Sachin", 56);
		sachin.incrementCounter();
		//Person.getName();
		
		System.out.println(radha.getName());
		radha.setName("Radhe");
		System.out.println(radha.getName());
		System.out.println(sachin.getAge());
		
		System.out.println(Person.getCounter());
	}

}
