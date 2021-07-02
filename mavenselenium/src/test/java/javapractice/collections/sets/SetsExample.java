package javapractice.collections.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		
		// A Set is a collection of Unique Objects
		// A Set do not contain Any Duplicates
		
		Set<String> names = new HashSet<String>();
		
		//Set treeSet = new TreeSet();
		
		names.add("Sehwag");
		names.add("Gautam");
		names.add("Rahul");
		names.add("Sachin");
		names.add("Wasim");
		names.add(null);
		
		names.remove("Rahul");
		
		System.out.println(names.contains("Wasim"));
		
		for(String name: names) {
			System.out.println(name);
		}

	}

}
