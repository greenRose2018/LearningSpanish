package useful.controller;

import vocab.view.SpanishFrame;

import java.util.ArrayList;
import java.util.List;

import vocab.model.*;
import vocab.model.food.*;
import vocab.model.food.fruits.*;
import vocab.model.food.bakerygoods.*;
import vocab.model.food.meats.*;
import vocab.model.food.pastries.*;
import vocab.model.food.seafoods.*;
import vocab.model.food.vegetables.*;

public class SpanishController
{
	private List<Fruits> fruits;
	private List<Food> foodList;
	private SpanishFrame mainFrame;
	
	public SpanishController()
	{
		fruits = new ArrayList<Fruits>();
		foodList = new ArrayList<Food>();
		buildFruitVocab();
		buildFoodList();
		
		mainFrame = new SpanishFrame(this);
	}
	
	public void start()
	{
		
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
		foodList.add(new Pasteries());
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
