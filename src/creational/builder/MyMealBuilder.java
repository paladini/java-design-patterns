package creational.builder;

import creational.builder.drink.Coke;
import creational.builder.drink.OrangeJuice;
import creational.builder.food.ChickenBurger;
import creational.builder.food.VeganBurger;

public class MyMealBuilder {

	public Meal prepareVeganMeal() {
		Meal meal = new Meal();
		meal.addItem(new VeganBurger());
		meal.addItem(new OrangeJuice());
		return meal;
	}
	
	public Meal prepareNonVeganMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger()); // animal death
		meal.addItem(new Coke()); // your death
		return meal;
	}
	
}
