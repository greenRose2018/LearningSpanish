package vocab.model.food.meats;

public class Fish extends Meats
{
	public Fish()
	{
		super("Bass", "Manzana","Seafood");
	}
	
	public String englishWord()
	{
		return "Bass";
	}
	
	public String spanishWord()
	{
		return "el róbalo";
	}
	
	public String categoryFood()
	{
		return "Seafood";
	}
}