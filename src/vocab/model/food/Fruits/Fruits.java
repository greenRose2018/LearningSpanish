package vocab.model.food.fruits;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Fruits extends FoodVocab implements Food
{
	public Fruits()
	{
		super("Fruit", "Fruita","Fruit");
	}
	
	public String englishWord()
	{
		return "Fruit";
	}
	
	public String spanishWord()
	{
		return "Fruita";
	}
	
	public String categoryFood()
	{
		return "Fruit";
	}

}
