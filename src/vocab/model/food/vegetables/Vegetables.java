package vocab.model.food.vegetables;

import vocab.model.FoodVocab;
import vocab.model.interfaces.Food;

public class Vegetables extends FoodVocab implements Food
{
	public Vegetables()
	{
		super("Vegetable", "El vegetal","Vegetable");
	}
	public Vegetables(String english)
	{
		super(english,"El vegetal","Vegetable");
	}
	
	public Vegetables(String english, String spanish)
	{
		super(english,spanish,"Vegetable");
	}
	
	public Vegetables(String english, String spanish, String type)
	{
		super(english,spanish,type);
	}
	
	public String englishWord()
	{
		return "Vegetable";
	}
	
	public String spanishWord()
	{
		return "El vegetal";
	}
	
	public String categoryFood()
	{
		return "Vegetable";
	}
	
}
