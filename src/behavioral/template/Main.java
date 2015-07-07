package behavioral.template;

public class Main {
	public static void main(String[] args) {
		
		Game game = new Cricket();
		game.play();
		
		game = new Soccer();
		game.play();
		
	}
}
