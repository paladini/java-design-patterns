package structural.decorator;

public class MyShapeDecorator implements Shape {
	
	Shape decoratedShape;
	
	public MyShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}
