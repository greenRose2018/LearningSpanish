package useful.controller;

import vocab.view.SpanishFrame;

import java.util.ArrayList;
import java.util.List;

import vocab.model.food.fruits.*;
import vocab.model.food.bakerygoods.*;
import vocab.model.food.meats.*;
import vocab.model.food.seafoods.*;
import vocab.model.food.vegetables.*;
import vocab.model.interfaces.*;
import vocab.model.tech.computerengineering.*;
import vocab.model.tech.computerscience.*;
import vocab.model.TechnicalWords;

public class SpanishController
{
	private List<Fruits> fruits;
	private List<Food> foodList;
	private List<BakeryGoods> bakedList;
	private List<Seafoods> seafoodList;
	private List<Vegetables> vegetableList;
	private List<Meats> meatList;
	
	private SpanishFrame mainFrame;
	
	private List<ComputerScience> computerScienceList;
	private List<ComputerEngineering> computerEngineeringList;
	private List<TechnicalWords> computerList;
	
	public SpanishController()
	{
		fruits = new ArrayList<Fruits>();
		foodList = new ArrayList<Food>();
		bakedList = new ArrayList<BakeryGoods>();
		seafoodList = new ArrayList<Seafoods>();
		vegetableList = new ArrayList<Vegetables>();
		meatList = new ArrayList<Meats>();
		
		computerScienceList = new ArrayList<ComputerScience>();
		computerEngineeringList = new ArrayList<ComputerEngineering>();
		computerList = new ArrayList<TechnicalWords>();
		
		buildFruitVocab();
		buildFoodList();
		buildSeafood();
		buildVeggies();
		buildMeat();
		buildBakedGoods();
		
		buildScience();
		buildEngineer();
		buildComputer();
		
		mainFrame = new SpanishFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void buildComputer()
	{
		computerList.add(new ComputerEngineering());
		computerList.add(new ComputerScience());
	}
	
	public void buildScience()
	{
		computerScienceList.add(new BigData());
		computerScienceList.add(new Bug());
		computerScienceList.add(new Code());
		computerScienceList.add(new ComputerScience());
		computerScienceList.add(new ControlPanel());
		computerScienceList.add(new DataStructures());
		computerScienceList.add(new Debug());
	}
	
	public void buildEngineer()
	{
		computerEngineeringList.add(new ComputerEngineering());
		computerEngineeringList.add(new CPU());
		computerEngineeringList.add(new Hardware());
		computerEngineeringList.add(new MotherBoard());
		computerEngineeringList.add(new RAM());
		computerEngineeringList.add(new ROM());
		computerEngineeringList.add(new Screen());
		
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
	
	public void buildBakedGoods()
	{
		bakedList.add(new BakeryGoods());
		bakedList.add(new Biscuit());
		bakedList.add(new Bread());
		bakedList.add(new Cake());
		bakedList.add(new CinnamonRoll());
		bakedList.add(new Cookie());
		bakedList.add(new Pie());
		bakedList.add(new SweetBread());
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
	public List<ComputerScience> getComputerScienceList() {
		return computerScienceList;
	}

	public List<ComputerEngineering> getComputerEngineeringList() {
		return computerEngineeringList;
	}
	public List<TechnicalWords> getComputerList() {
		return computerList;
	}
	public List<Fruits> getFruits()
	{
		return fruits;
	}
	
	public List<Food> getFood()
	{
		return foodList;
	}
	
	public List<Meats> getMeat()
	{
		return meatList;
	}
	
	public List<Vegetables> getVeggies()
	{
		return vegetableList;
	}
	
	public List<BakeryGoods> getBakedGoods()
	{
		return bakedList;
	}
	
	public List<Seafoods> getSeafoods()
	{
		return seafoodList;
	}
	public SpanishFrame getSpanishFrame()
	{
		return mainFrame;
	}
	//startAbstraction
	public String [] convertFood()
	{
		String [] names = new String [foodList.size()];
		
		for (int index = 0; index < foodList.size(); index++)
		{
			names[index] = foodList.get(index).englishWord();
		}
		return names;
	}
	//endAbstraction
	public String[] convertItem()
	{
		String [] names = new String [fruits.size()];
		
		for (int index = 0; index < fruits.size(); index++)
		{
			names[index] = fruits.get(index).getEnglishWord();
		}
		return names;
	}
	
	public String[] convertSeafood()
	{
		String [] names = new String [seafoodList.size()];
		
		for (int index = 0; index < seafoodList.size(); index++)
		{
			names[index] = seafoodList.get(index).getEnglishWord();
		}
		return names;
	}
	
	public String[] convertVeggies()
	{
		String [] names = new String [vegetableList.size()];
		
		for (int index = 0; index < vegetableList.size(); index++)
		{
			names[index] = vegetableList.get(index).getEnglishWord();
		}
		return names;
	}
	public String[] convertBakedGoods()
	{
		String [] names = new String [bakedList.size()];
		
		for (int index = 0; index < bakedList.size(); index++)
		{
			names[index] = bakedList.get(index).getEnglishWord();
		}
		return names;
	}
	public String[] convertMeats()
	{
		String [] names = new String [meatList.size()];
		
		for (int index = 0; index < meatList.size(); index++)
		{
			names[index] = meatList.get(index).getEnglishWord();
		}
		return names;
	}	
	
	public String[] convertScience()
	{
		String [] names = new String [computerScienceList.size()];
		
		for (int index = 0; index < computerScienceList.size(); index++)
		{
			names[index] = computerScienceList.get(index).getEnglishWord();
		}
		return names;
	}	
	public String[] convertEngineer()
	{
		String [] names = new String [computerEngineeringList.size()];
		
		for (int index = 0; index < computerEngineeringList.size(); index++)
		{
			names[index] = computerEngineeringList.get(index).getEnglishWord();
		}
		return names;
	}	
	
	public String[] convertComputer()
	{
		String [] names = new String [computerList.size()];
		
		for (int index = 0; index < computerList.size(); index++)
		{
			names[index] = computerList.get(index).getEnglishWord();
		}
		return names;
	}	
}
