package vocab.model.food.Fruits;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Fruits extends FoodVocab implements Food
{
	public Fruits()
	{
		super("Fruit", "Fruit");
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
