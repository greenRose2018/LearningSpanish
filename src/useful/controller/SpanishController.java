package useful.controller;

import vocab.view.SpanishFrame;

import java.util.ArrayList;
import java.util.List;

import vocab.model.*;
import vocab.model.food.*;
import vocab.model.food.fruits.*;
import vocab.model.food.bakerygoods.*;
import vocab.model.food.meats.*;
import vocab.model.food.seafoods.*;
import vocab.model.food.vegetables.*;

public class SpanishController
{
	private List<Fruits> fruits;
	private List<Food> foodList;
	private List<BakeryGoods> bakedList;
	private List<Seafoods> seafoodList;
	private List<Vegetables> vegetableList;
	private List<Meats> meatList;
	private SpanishFrame mainFrame;
	
	public SpanishController()
	{
		fruits = new ArrayList<Fruits>();
		foodList = new ArrayList<Food>();
		bakedList = new ArrayList<BakeryGoods>();
		seafoodList = new ArrayList<Seafoods>();
		vegetableList = new ArrayList<Vegetables>();
		meatList = new ArrayList<Meats>();
		buildFruitVocab();
		buildFoodList();
		
		mainFrame = new SpanishFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void buildMeat()
	{
		meatList.add(new Fish());
		meatList.add(new Beef());
		meatList.add(new Chicken());
		meatList.add(new Pork());
		meatList.add(new Meats());
		meatList.add(new Sheep());
		meatList.add(new Turkey());
	}
	
	public void buildSeafood()
	{
		seafoodList.add(new Bass());
		seafoodList.add(new Octopus());
		seafoodList.add(new Oyster());
		seafoodList.add(new Salmon());
		seafoodList.add(new Seafoods());
		seafoodList.add(new Shrimp());
		seafoodList.add(new Tilapia());
		seafoodList.add(new Tuna());
	}
	
	public void buildVeggies()
	{
		vegetableList.add(new Cabbage());
		vegetableList.add(new Carrot());
		vegetableList.add(new Cauliflower());
		vegetableList.add(new Cucumber());
		vegetableList.add(new Lettuce());
		vegetableList.add(new Onion());
		vegetableList.add(new Potato());
		vegetableList.add(new Tomato());
		vegetableList.add(new Vegetables());
	}
	public void buildFruitVocab()
	{
		fruits.add(new Banana());
		fruits.add(new Strawberry());
		fruits.add(new Orange());
		fruits.add(new Grapes());
		fruits.add(new Apple());
		fruits.add(new Peach());
		fruits.add(new Fruit());
	}
	
	public void buildFoodList()
	{
		foodList.add(new BakeryGoods());
		foodList.add(new Meats());
		foodList.add(new Seafoods());
		foodList.add(new Vegetables());
		foodList.add(new Fruits());
	}
	public List<Fruits> getFruits()
	{
		return fruits;
	}
	
	public List<Food> getFood()
	{
		return foodList;
	}
	
	public SpanishFrame getSpanishFrame()
	{
		return mainFrame;
	}
	
	public String [] convertFood()
	{
		String [] names = new String [foodList.size()];
		
		for (int index = 0; index < foodList.size(); index++)
		{
			names[index] = foodList.get(index).englishWord();
		}
		return names;
	}
	
	public String[] convertItem()
	{
		String [] names = new String [fruits.size()];
		
		for (int index = 0; index < fruits.size(); index++)
		{
			names[index] = fruits.get(index).englishWord();
		}
		return names;
	}
	
}
