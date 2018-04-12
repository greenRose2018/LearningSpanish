package vocab.model.food.meats;

public class Chicken extends Meats
{
	public Chicken()
	{
		super("Chicken", "Carne de pollo","Meat");
	}
	
	public String englishWord()
	{
		return "Chicken";
	}
	
	public String spanishWord()
	{
		return "Carne de pollo";
	}
	
	public String categoryFood()
	{
		return "Meat";
	}
}