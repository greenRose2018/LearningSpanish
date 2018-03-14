package vocab.model.foodWords;

import vocab.model.FoodVocab;

public class Bannana extends FoodVocab implements Food
{
	public Bannana()
	{
		super("Bannana", "Fruit");
		
	}
	
	public String englishWord()
	{
		return "Bannana";
	}
	
	public String spanishWord()
	{
		return "Platano";
	}
	
	public String categoryFood()
	{
		return "Fruit";
	}

}
