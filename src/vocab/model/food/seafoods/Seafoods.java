package vocab.model.food.seafoods;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class Seafoods extends FoodVocab implements Food
{
	public Seafoods()
	{
		super("Seafood", "Los mariscos","Seafood");
	}
	public Seafoods(String english)
	{
		super(english,"Los mariscos","Seafood");
	}
	
	public Seafoods(String english, String spanish)
	{
		super(english,spanish,"Seafood");
	}
	
	public Seafoods(String english, String spanish, String type)
	{
		super(english,spanish,type);
	}
	
	public String englishWord()
	{
		return "Seafood";
	}
	
	public String spanishWord()
	{
		return "Los mariscos";
	}
	
	public String categoryFood()
	{
		return "Seafood";
	}
	
}
