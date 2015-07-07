package structural.decorator;

public class RedShapeDecorator extends MyShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border color: red");
	}

}
