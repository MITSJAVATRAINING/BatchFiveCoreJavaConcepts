package inheritanceexamples;

public class MathOperationImpl extends MathOperation {

	
	public int add(int a, int b) {
		return a+b;
	}

	public int substract(int a, int b) {
		return a-b;
	}

	public int multiply(int a, int b) {
		return a*b;
	}

	public int divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String args[]) {
		MathOperation operation = new MathOperationImpl();
		
		System.out.println("Sum of 10 and 20 is " + operation.add(10, 20));
	}

}
