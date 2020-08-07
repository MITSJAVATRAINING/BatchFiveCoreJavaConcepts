package javabasic;

public class OopsConcepts {
/**
 * 1.) Polymorphism - Reprsentation of data in more than one form.
 * 		a) static polymorphism or compile time polymorphism or method overloading
 * 		b) dynamic polymorphism or run time polymorphism or method overriding 
 * 
 * 2.) Encapsulation 
 * 
 * 3.) Abstraction 
 * 
 * 4.) Inheritance
 * 
 * Final Keyword
 * 
 * 1) variable name - we can not change the value of the variable.
 * 2) method name - we can not override the method.
 * 3) class name - we can not extends it.
 * 
 * 
 * static keyword 
 * 1) method name 
 * 2) variable name
 * 
 * **/
	
	final int a = 10;
	static int  b = 20;
	
	static String name = "Shaleen";
	
	static int c = 10;
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public float divide(float a, float b) {
		float c = a/b;
		return c;
	}
	
	public static void main(String args[]) {
		OopsConcepts obj = new OopsConcepts();
		obj.b = 30;
		b = 30;
		name = "Vaibhav";
		//obj.a = 20;
		//OopsConcepts.sum(10,10);
		System.out.println(c);
		
		Integer a = new Integer(10); int b = new Integer(10);
		
		if (a == b) {
			System.out.println("value of a is equals to b");
		}
		
		String name1 = new String("Shaleen");
		String name2 = new String("Shaleen");
		
		if (name1 == name2) {
			System.out.println("value of name1 is same as name2");
		} else {
			System.out.println("They are different");
		}
		
		if (name1.equals(name2)) {
			System.out.println("They are same while comparing equals");
		}
		
		
		float c = obj.divide(10, 3);
		System.out.println("The value of c in called method" + c);
	}
}
