package vocab.model.food.bakerygoods;

public class Cookie extends BakeryGoods
{
	public Cookie()
	{
		super("Cookie", "La galleta","Bakery Goods");
	}
	
	public String englishWord()
	{
		return "Cookie";
	}
	
	public String spanishWord()
	{
		return "La galleta";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}