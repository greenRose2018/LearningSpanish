package vocab.model.food.meats;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Meats extends FoodVocab implements Food
{
	public Meats()
	{
		super("Meat", "El Carne","Meat");
	}
	public Meats(String english)
	{
		super(english,"El Carne","Meat");
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
		return "El Carne";
	}
	
	public String categoryFood()
	{
		return "Meat";
	}
}
