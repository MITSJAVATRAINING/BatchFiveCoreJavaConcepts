package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayListExample {
	
	/**
	 * List Datastructure (List Collection) :- Interface which extends collection
	 * List works on LIFO (Last In First Out) Architecture.
	 * Queue works on FIFO (First In First Out)
	 * Default size of list is 10.
	 * */
	
	public static void main(String args[]) {
		int[] a = new int[5];
		
		List<Integer> list = new LinkedList<Integer>();
		
		List<String> list1 = new ArrayList<String>();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(90);
		list.add(90);list.add(90);
		list.add(50);
		list.add(60);
		list.add(60);
		list.add(60);
		list.add(60);
		
		//list.add("Shaleen");
		
		//list.add("Vaibhav");
		
		System.out.println("The element present at index 3 " + list.get(3));
		System.out.println("The element present at index 3 " + list.get(4));
		
		// Iterating array list using extended for loop
		
		for (Integer i : list)  {
			System.out.println("Element is " + i);
		}
		
		// Iterating array using iterable interface.
		
		Collections.sort(list);
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Set s = new HashSet<>(list);
	
		
		
	}

}
