package javapractice.collections.lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javapractice.hasa.A;

public class JavaListExamples {

	public static void main(String[] args) {
		
		// primitives - int, double, char, boolean
		// Use Arrays to store multiple values
		
		//Object of User defined class
		//Any java Objects - String
		//If you want to store primitives - use Wrapper Class Objects
		
		List<String> ll = new LinkedList<String>();
		ll.add("ONE");
		ll.add("THREE");
		
		ll.add(1, "TWO");
		
		
		
		List<String> colorsList = new ArrayList<String>();

		colorsList.add("RED");
		colorsList.add("BLUE");
		
		int size = colorsList.size();
		
		colorsList.add("GREEN");
	
		System.out.printf("The size of the colors List is %d\n", size);

		System.out.println(colorsList);
		
		colorsList.remove("GREEN");
	
		System.out.println(colorsList);
		
		colorsList.add(1, "GREEN");
		
		System.out.println(colorsList);
		
		colorsList.set(1, "GREEN MODIFIED");
		
		System.out.println(colorsList);
		
		List<String> myList2 = new ArrayList<String>();
		myList2.add("BLACK");
		myList2.addAll(colorsList);
		
		System.out.println(myList2);
		
		myList2.clear();
		
		System.out.println(myList2);
		
		List<String> myList3 = new ArrayList<String>(myList2);
		System.out.println(myList3);
		
		String[] arr = (String[]) myList3.toArray();
	}

}
