
public class JavaBasic {

	int experience = 10; // primitive data type (Integer class)
	long phoneNumner = 123456789;
	String name = "Shaleen"; // wrapper class
	double salary = 10.5; // Double class
	boolean isEmployee = true;

	public void sum(int a, int b) {
//		int a = 10;
//		int b = 20;
		int c = a + b;
		System.out.println("The Sum of two numbers is " + c);
	}
	
	public void substract() {
		double a = 10;
		double b = 20;
		double c = b - a;
		System.out.println("the substraction of two numbers is " + c);
	}
	
	public void compare(int a, int b) {
		if (a == b) {
			System.out.println("a is equals to b");
		} else if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("a is greater than b");
		}
	}

	public static void main(String args[]) {
		System.out.println("Hello World");
		
		JavaBasic obj = new JavaBasic();
		
		obj.sum(10, 20);
		
		obj.sum(20, 20);
		
		obj.sum(30, 20);
		obj.sum(40, 20);
		
		obj.compare(10, 20);
		//obj.substract();
		
	}
}
