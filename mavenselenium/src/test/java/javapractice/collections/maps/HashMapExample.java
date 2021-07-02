package javapractice.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String args[]) {
		
		//Map<String, String> grades = new HashMap<String, String>();
		
		Map<String, String> grades = new LinkedHashMap<String, String>();
		
		grades.put("Ram", "A");
		grades.put("Kumar", "APlus");
		grades.put("Rahim", "A");
		
//		String grade = grades.get("Ram");
//		
//		System.out.println(grade);
		
//		System.out.println("*** Using Lambda ***");
//		grades.forEach((key,value) -> System.out.printf("%s ==> %s\n", key, value));
		
//		System.out.println("*** Using Key Set ***");
//		Set<String> keys = grades.keySet();
//		
//		for(String key : keys) {
//			System.out.printf("%s ==> %s\n", key, grades.get(key));
//		}
		
		
		//Map.Entry ==> List of All entries in the Map <key, value pair>
		
		Set<Map.Entry<String, String>> entryMap = grades.entrySet();
		
		for(Map.Entry<String, String> kvpair: entryMap) {
			System.out.printf("%s ==> %s\n", kvpair.getKey(), kvpair.getValue());
		}
		
	}
}
