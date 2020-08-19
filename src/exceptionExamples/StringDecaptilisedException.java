package exceptionExamples;

public class StringDecaptilisedException extends Exception {

	String message;

	StringDecaptilisedException(String str) {
		super();
		this.message = str;
	}

	public String toString() {
		return this.message;
	}
}
