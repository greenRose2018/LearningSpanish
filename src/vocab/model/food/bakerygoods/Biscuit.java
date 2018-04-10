package vocab.model.food.bakerygoods;

public class Biscuit extends BakeryGoods
{
	public Biscuit()
	{
		super("Biscuit", "El panecillo","Bakery Goods");
	}
	
	public String englishWord()
	{
		return "Biscuit";
	}
	
	public String spanishWord()
	{
		return "El panecillo";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}