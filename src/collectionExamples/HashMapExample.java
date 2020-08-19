package collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main (String args[]) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Ram", 10);
		map.put("Shyam", 20);
		map.put("Ramesh", 25);
		map.put("Vaibhav", 19);
		map.put("Sheshan", 15);
		map.put("Ramesh", 30);
		
		
		System.out.println(map.get("Ramesh"));
		
		System.out.println("Iterating HashMap");
		for (String a: map.keySet()) {
			System.out.println(a +"  "+ map.get(a));
		}
	}
}
