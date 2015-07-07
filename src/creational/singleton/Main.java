package creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		// You can't do something like that:
		// MySingleton singleton = new MySingleton();
		
		// Instead, you should get the unique instance of the class through our public static method.
		MySingleton singleton = MySingleton.getInstance();
		
		// Then you can call any methods you like
		singleton.doAnything();
		
		// To prove that you've only a single instance of MySingleton, let's "instantiate" another 
		// object from MySingleton class.
		MySingleton anotherSingletonObject = MySingleton.getInstance();
		
		// If the objects are the same, it should enter the if. Of course it has a unique instance of MySingleton.
		if (anotherSingletonObject == singleton) {
			System.out.println("There's only a single instance of this class!");
		}
		
		// Conclusion: when we call singleton.doAnything() and anotherSingletonObject.doAnything(), 
		// we're calling the EXACTLY same instance. There's only a single instance, no matter what you do. 
	}

}
