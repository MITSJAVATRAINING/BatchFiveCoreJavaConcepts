package javabasic;

public class LoopExamples {
	
	/**
	 * 1.) For Loop 
	 * 
	 *    a) initialization
	 *    b) condition
	 *    c) increment/decrement
	 *    d) logic or task to be performed.
	 *    
	 * 2.) While Loop
	 * 3.) do-while Loop
	 * 4.) Extended For Loop
	 * 5.) forEach Loop
	 * */

	public static void main(String args[]) {
		
//		System.out.println("Printing numbers using for loop");
//		for (int i = 1 ; i <= 10; i=i+1) {
//			System.out.println("The value of i " +i );
//		}
//		
//		System.out.println("Printing numbers using while loop");
//		int i = 1;
//		while(i<=10) {
//			System.out.println("The value of i " +i );
//			i = i + 1 ;
//		}
		
	   /*
	    * 1 + 1 = 2
	    * 1 + 2 = 3
	    * 
	    * 
	    * 1 + 10 = 11
	    * 2 + 1  = 3
	    * 2 + 2 = 4
	    * 
	    * 
	    * 2 + 10 = 12
	    * 
	    * 
	    * 
	    * 10 + 10 = 100
	    * 
	    * */
		
		for (int i = 1 ; i <= 10 ; i++) {
			for (int j = 1; j <= i && j < 10; j ++) {
				System.out.println("The addition of " + i + " and " + j + " is " + (i+j) );
			}
		}
		
	}
}
