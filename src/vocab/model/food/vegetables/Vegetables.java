package vocab.model.food.vegetables;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Vegetables extends FoodVocab implements Food
{
	public Vegetables()
	{
		super("Vegetables", "Fruita","Vegetable");
	}
	public Vegetables(String english)
	{
		super(english,"Fruta","Vegetable");
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
		return "Fruita";
	}
	
	public String categoryFood()
	{
		return "Vegetable";
	}
}
