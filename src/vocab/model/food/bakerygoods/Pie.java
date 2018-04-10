package vocab.model.food.bakerygoods;

public class Pie extends BakeryGoods
{
	public Pie()
	{
		super("Pie", "La tarta","Bakery Goods");
	}
	
	public String englishWord()
	{
		return "Pie";
	}
	
	public String spanishWord()
	{
		return "La tarta";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}