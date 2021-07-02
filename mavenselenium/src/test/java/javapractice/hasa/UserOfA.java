package javapractice.hasa;

public class UserOfA {

	public static void main(String[] args) {
		
		A objectA = new A();
		int a = 5;
		objectA.setNum1(a); // you pass 5;
		System.out.println(a);
		objectA.setNum2(105);
		//System.out.println(objectA.a);
//		System.out.println(objectA.getNum1());
//		
		B objectB = new B();
		objectB.setaObj(objectA);  // Reference and not by value
		System.out.println(objectB.getaObj().getNum2());
		
		
		// ObjectA --> new A()
		// objA --> objectA -- > new A()
		
		A objA2 = new A();
		A objA3 = objA2;
		
		objA2.setNum2(45);
		
		System.out.println(objA3.getNum2());
		
		objA2 = null;
		
		System.out.println(objA3.getNum2());
		
		
		
		
		
		
		
		
		
		
//		objectB.getAObj().setNum1(34);
//		System.out.println(objectB.getAObj().getNum1());

	}

}
