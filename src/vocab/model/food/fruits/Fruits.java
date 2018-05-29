package vocab.model.food.fruits;

import vocab.model.FoodVocab;
import vocab.model.interfaces.Food;

public class Fruits extends FoodVocab implements Food
{
	public Fruits()
	{
		super("Fruit", "Fruita","Fruit");
	}
	public Fruits(String english)
	{
		super(english,"Fruta","Fruit");
	}
	
	public Fruits(String english, String spanish)
	{
		super(english,spanish,"Fruit");
	}
	
	public Fruits(String english, String spanish, String type)
	{
		super(english,spanish,type);
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
