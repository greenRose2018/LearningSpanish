package vocab.model.food.pastries;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Pasteries extends FoodVocab implements Food
{
	public Pasteries()
	{
		super("Pastery", "Fruita","Pastery");
	}
	public Pasteries(String english)
	{
		super(english,"Fruta","Pastery");
	}
	
	public Pasteries(String english, String spanish)
	{
		super(english,spanish,"Pastery");
	}
	
	public Pasteries(String english, String spanish, String type)
	{
		super(english,spanish,type);
	}
	
	public String englishWord()
	{
		return "Pastery";
	}
	
	public String spanishWord()
	{
		return "Fruita";
	}
	
	public String categoryFood()
	{
		return "Pastery";
	}
}
