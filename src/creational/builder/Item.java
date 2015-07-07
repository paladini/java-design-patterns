package creational.builder;

import creational.builder.packing.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
