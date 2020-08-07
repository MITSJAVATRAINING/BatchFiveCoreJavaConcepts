package inheritanceexamples;

public abstract class Automobile {

	String name;
	int noOfWheels;
	
	public abstract void setAutomobileName(String name);
	public abstract void defineEngine();
	
	
	public void setNoOfWheels(int number) {
		this.noOfWheels = number;
	}
}
