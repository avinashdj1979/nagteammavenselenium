package javapractice.inheritance;

public class MethodOverlaoading {
	

	public byte add(byte a) {
		System.out.println("Byte called");

		
		return a;

	}
	
	public double add(double a, double b) {
		System.out.println("Double called");
		return a + b;
	}
	
	public int add(int a) {
		return a + 2;
	}
	
	public int add(int a, int b) {
		System.out.println("Int called");
		return a + b;
	}
	
	public double add(double a) {
		return a + 2.5D;
	}
	
	public String add(int a, String str) {
		return str + a;
	}
	
	public String add(String str, int a) {
		return a + str;
	}
	
	public static void main(String[] args) {
		MethodOverlaoading a = new MethodOverlaoading();
		System.out.println(a.add(5));
		System.out.println(a.add(2d, 2d));
		System.out.println(a.add("Test" , 2));
		System.out.println(a.add(2, "Test"));
		
		short myShort = 56;
		float myFloat = 2.3f;
		long l = 3l; // or 3L;
		boolean myBoolean = true; // orfalse;
		char myChar = 'a';
		char myChar2 = 66;
		char myChar3 = 66 + 2;
		char myChar4 = '\u20B9';
		
//		System.out.println(myShort);
//		System.out.println(myFloat);
//		System.out.println(l);
//		System.out.println(myBoolean);
//		System.out.println(myChar);
//		System.out.println(myChar2);
//		System.out.println(myChar3);
		
		System.out.println(myChar4);
		
	}
}
