package inheritanceexamples;

public class TwoWheeler extends Automobile implements AutomobileInterface { //has - a relationship

	@Override
	public void noOfPassangers(int a) {
		System.out.println("No of Passangers " + a);
	}

	@Override
	public void setAutomobileName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defineEngine() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String args[]) {
		TwoWheeler t = new TwoWheeler();
		t.noOfPassangers(2);
	}

}
