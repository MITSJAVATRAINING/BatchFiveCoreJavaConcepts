package javabasic;

import inheritanceexamples.Automobile;

public class FourWheeler extends Automobile  { // IS-A Relationship

	@Override
	public void setAutomobileName(String name) {
		this.name = name;
		System.out.println("Automobile is  " + name);
	}

	@Override
	public void defineEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine is in progress");
	}
	
	public static void main(String args[]) {
		FourWheeler f = new FourWheeler();
		f.setAutomobileName("CAR");
		
		Automobile a = new FourWheeler();
	}

}
