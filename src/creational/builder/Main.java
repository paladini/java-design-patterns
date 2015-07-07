package creational.builder;

public class Main {
	public static void main(String[] args) {
		
		MyMealBuilder mealBuilder = new MyMealBuilder();
		
		// Vegan meal
		Meal vegan = mealBuilder.prepareVeganMeal();
		System.out.println("Veg meal");
		vegan.showItems();
		System.out.println("Total cost: " + vegan.getCost());
		
		// Non vegan meal
		Meal nonVegan = mealBuilder.prepareNonVeganMeal();
		System.out.println("\nNon-Veg meal");
		nonVegan.showItems();
		System.out.println("Total cost: " + nonVegan.getCost());
		
	}
}
