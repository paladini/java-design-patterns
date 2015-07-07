package creational.builder.food;

import creational.builder.Item;
import creational.builder.packing.Packing;
import creational.builder.packing.Wrapper;

public abstract class Burguer implements Item {
	
	public Packing packing() {
		return new Wrapper();
	}
	
	public abstract float price();
}
