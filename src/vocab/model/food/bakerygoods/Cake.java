package vocab.model.food.bakerygoods;

public class Cake extends BakeryGoods
{
	public Cake()
	{
		super("Cake", "El pastel","Bakery Goods");
	}
	
	public String englishWord()
	{
		return "Cake";
	}
	
	public String spanishWord()
	{
		return "El pastel";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}