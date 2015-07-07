package behavioral.strategy;

public class Main {
	public static void main(String[] args) {

		// Sum
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		// Subtract
		context = new Context(new OperationSub());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		// Multiply
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		
	}
}
