package exceptionExamples;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * Exception :
 * 1) Exception Name
 * 2) Exception Message
 * 3) stack trace
 * 
 * 
 * */
public class BasicExceptions {
	
	public void readFile() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/abc.txt");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void sum(Integer a, Integer b) throws NullPointerException {
		int c = 0;
		c = a + b;
		System.out.println("The value of c is " + c);
	}

	public void divide(int a, Integer b) {
		int c  = 0;
		try {
			c = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Number can not be divided by 0 .. Arithmatic Exception occurs");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Name"  + e);
			System.out.println("Message " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("The value of c is " + c);
		}
	}
	
	public void checkAge(Integer age) throws AgeException, NullPointerException  {
		if (age < 18) {
			throw new AgeException("Age can not be less than 18 years");
		}
	}
	
	public void checkString(String str) throws StringDecaptilisedException {
		int ascii = (int) str.charAt(0);
		System.out.println(ascii);
		if (ascii >= 97 && ascii < 122) {
			throw new StringDecaptilisedException("String can not start with small letter");
		}
	}
	
	public static void main(String args[]) {
		BasicExceptions obj = new BasicExceptions();
		try {
			//obj.sum(10, null);
			//obj.checkString("Shaleen");
			obj.checkAge(null);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
