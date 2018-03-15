package vocab.model.food.bakerygoods;

import vocab.model.FoodVocab;
import vocab.model.food.Food;

public class BakeryGoods extends FoodVocab implements Food
{
	public BakeryGoods()
	{
		super("Bakery Goods", "Fruita","Bakery Goods");
	}
	public BakeryGoods(String english)
	{
		super(english,"Fruta","Bakery Goods");
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
		return "Fruita";
	}
	
	public String categoryFood()
	{
		return "Bakery Goods";
	}
}