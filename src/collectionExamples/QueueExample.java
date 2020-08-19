package collectionExamples;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

	public static void main(String args[]) {
		Queue<Integer> a = new ArrayDeque<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		for (Integer i: a) {
			System.out.println(i);
		}
	}
}
