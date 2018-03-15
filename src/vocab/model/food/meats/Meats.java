package vocab.model.food.meats;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Meats extends FoodVocab implements Food
{
	public Meats()
	{
		super("Meats", "Fruita","Meat");
	}
	public Meats(String english)
	{
		super(english,"Fruta","Meat");
	}
	
	public Meats(String english, String spanish)
	{
		super(english,spanish,"Meat");
	}
	
	public Meats(String english, String spanish, String type)
	{
		super(english,spanish,type);
	}
	
	public String englishWord()
	{
		return "Meat";
	}
	
	public String spanishWord()
	{
		return "Fruita";
	}
	
	public String categoryFood()
	{
		return "Meat";
	}
}
