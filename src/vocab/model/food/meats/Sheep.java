package vocab.model.food.meats;

public class Sheep extends Meats
{
	public Sheep()
	{
		super("Sheep", "Carne de oveja","Meat");
	}
	
	public String englishWord()
	{
		return "Sheep";
	}
	
	public String spanishWord()
	{
		return "Carne de oveja";
	}
	
	public String categoryFood()
	{
		return "Meat";
	}
}