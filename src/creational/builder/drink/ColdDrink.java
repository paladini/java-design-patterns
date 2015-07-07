package creational.builder.drink;

import creational.builder.Item;
import creational.builder.packing.Bottle;
import creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {
	public Packing packing() {
		return new Bottle();
	}
	
	public abstract float price();
}
