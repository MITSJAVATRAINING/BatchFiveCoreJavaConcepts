package exceptionExamples;

public class AgeException extends Exception {
	
	String message;

	AgeException(String str) {
		super();
		this.message = str;
	}

	public String toString() {
		return "AgeException [message=" + message + "]";
	}
	
	
}
