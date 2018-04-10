package vocab.model.food.bakerygoods;

public class Bread extends BakeryGoods
{
	public Bread()
	{
		super("Bread", "El pan","Bakery Goods");
	}
	
	public String englishWord()
	{
		return "Bread";
	}
	
	public String spanishWord()
	{
		return "El pan";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}