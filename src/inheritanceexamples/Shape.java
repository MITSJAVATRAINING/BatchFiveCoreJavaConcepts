package inheritanceexamples;

public class Shape {

	String name;
	int areaOfShape;
	int noOfVertices;

	
	public void setName(String name) {
		this.name = name;
		System.out.println("The name of shape is " + name);
		
	}

	public void setAreaOfShape(int vertices) {
		this.areaOfShape = vertices;
	}

	public void setNoOfVertices(int noOfVertices) {
		this.noOfVertices = noOfVertices;
	}

}
