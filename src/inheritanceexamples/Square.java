package inheritanceexamples;

public class Square extends Shape {
	
	public void setAreaOfShape(int side) {
		this.areaOfShape = side * side;
		System.out.println("Area of shape " + this.name + " is " + this.areaOfShape);
	}
	
	public static void main(String args[]) {
		Square s = new Square();
		s.setName("Square");
		s.setAreaOfShape(10);
	}

}
