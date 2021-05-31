package javapractice;

public class Person {
	//instance variables - why this is private
	private String name;
	private int age;
	
	private static int counter;
	
	public static int getCounter() {
		return counter;
	}

	public static void incrementCounter() {
		counter++;
	}

	//constructors - what is the use constructor
	public Person() {
		
	}
	
	//Constructor overloading
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eats() {
		System.out.println(String.format("%s eats anything edible and his age is %d", name, age));
	}
	
}
