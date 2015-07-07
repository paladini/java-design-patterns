package creational.singleton;

public class MySingleton {
	
	private static MySingleton instance = null;
	
	// Private constructor
	private MySingleton() {}
	
	// Static method that returns the unique instance of this class.
	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
	
	/*
	 * 
	 *      MY CUSTOM METHODS
	 * 
	 */
	public void doAnything() {
		System.out.println("Doing anything");
	}

}
