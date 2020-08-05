package eatables;

public class Fruit {

	// data 
	String name; 
	String shape;
	String taste;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public Fruit(String name, String shape, String taste) {
		this.name = name;
		this.shape = shape;
		this.taste = taste;
	}

	// behaviour
	public void printFruit() {
		System.out.println("Fruit: " + " " + name + " " + shape +  " " + taste);
	}
	
	public static void main(String args[]) {
		Fruit apple = new Fruit("Apple", "round", "sweet");
		Fruit orange = new Fruit("Orange", "round", "sour");
		

		apple.printFruit();

		
		orange.printFruit();
		
		Fruit banana = new Fruit("Banana");
		
		banana.printFruit();
	}
}
