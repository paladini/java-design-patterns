package behavioral.state;

public class Main {
	public static void main(String[] args) {
		Context context = new Context();
		
		// Start State
		State startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		
		// Stop State
		State stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
		
	}
}
