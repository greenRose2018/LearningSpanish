package vocab.model.food.bakerygoods;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class BakeryGoods extends FoodVocab implements Food
{
	public BakeryGoods()
	{
		super("Bakery Goods", "Productos de panadería","Bakery Goods");
	}
	public BakeryGoods(String english)
	{
		super(english,"Productos de panadería","Bakery Goods");
	}
	
	public BakeryGoods(String english, String spanish)
	{
		super(english,spanish,"Bakery Goods");
	}
	
	public BakeryGoods(String english, String spanish, String type)
	{
		super(english,spanish,type);
	}
	
	public String englishWord()
	{
		return "Bakery Goods";
	}
	
	public String spanishWord()
	{
		return "Productos de panadería";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}