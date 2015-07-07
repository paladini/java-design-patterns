package creational.factory;

public class Main {
	public static void main(String[] args) {
		
		// Creating my awesome factory
		MyShapeFactory shapeFactory = new MyShapeFactory();
		
		// Get and print a circle object
		Shape myCircle = shapeFactory.getShape("CIRCLE");
		myCircle.draw();
		
		// Get and print another circle object (ANOTHER, a new instance of circle)
		Shape myOtherCircle = shapeFactory.getShape("CIRCLE");
		myOtherCircle.draw();
		
		// Get and print a square object
		Shape mySquare = shapeFactory.getShape("SQUARE");
		mySquare.draw();
		
		// Get and print a rectangle object
		Shape myRectangle = shapeFactory.getShape("RECTANGLE");
		myRectangle.draw();
		
	}
}
