package vocab.model.foodWords;

import vocab.model.FoodVocab;

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
