package vocab.model.food.meats;

public class Fish extends Meats
{
	public Fish()
	{
		super("Fish", "Carne de pescado","Meat");
	}
	
	public String englishWord()
	{
		return "Fish";
	}
	
	public String spanishWord()
	{
		return "Carne de pescado";
	}
	
	public String categoryFood()
	{
		return "Meat";
	}
}