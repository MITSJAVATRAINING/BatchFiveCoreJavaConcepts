package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basic {

	public static void main(String args[]) {
		
		Operation op = (int x, int y) -> x*y;
		
		//System.out.println("The multiplication of 2 numbers are " + op.calculate(10, 2));
		
		op = (int x, int y) -> x + y;
		//System.out.println("The addition of 2 numbers are " + op.calculate(10, 2));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(4);
		list.add(5);
		list.add(10);
		list.add(9);
		list.add(7);
		
		//list.stream().map(x -> x*x).collect(Collectors.toList()).forEach(x -> System.out.println(x));
		
		//list.stream().filter(x-> x%2==0).collect(Collectors.toList()).forEach(x -> System.out.println(x));
		
		//list.stream().sorted().collect(Collectors.toList()).forEach(x -> System.out.println(x));
		
		int sum = list.stream().reduce(1,(ans, i) -> ans*i);
		System.out.println(sum);
//		for(Integer a: square) {
//			System.out.println(a);
//		}
	}
}
