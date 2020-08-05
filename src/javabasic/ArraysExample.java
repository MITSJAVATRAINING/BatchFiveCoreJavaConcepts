package javabasic;

public class ArraysExample {

	public static void main (String args[]) {
		String[] names = new String[] {"Shaleen", "Vaibhav", "Sheshan"};
		
		System.out.println("The length of array " + names.length);
		
		System.out.println("Name at index 0 " + names[0]);
		System.out.println("Name at index 1 " + names[1]);
		System.out.println("Name at index 2 " + names[2]);
		
		int[] age = new int[3];
		age[0] = 25;
		age[1] = 30;
		age[2] = 26;
		
		for (int i = 0 ;i < age.length; i++) {
			System.out.println("Name and age at index " + i + " is " + names[i] + " and " + age[i]);
		}
	}
}
