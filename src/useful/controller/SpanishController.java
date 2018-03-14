package useful.controller;

import vocab.view.SpanishFrame;

import java.util.ArrayList;
import java.util.List;

import vocab.model.*;
import vocab.model.food.*;
import vocab.model.food.fruits.*;

public class SpanishController
{
	private List<Fruits> fruits;
	private SpanishFrame mainFrame;
	
	public SpanishController()
	{
		fruits = new ArrayList<Fruits>();
		buildFruitVocab();
		
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
	}
	public SpanishFrame getSpanishFrame()
	{
		return mainFrame;
	}
	public String [] convertFood()
	{
		String [] names = new String [fruits.size()];
		
		for (int index = 0; index < fruits.size(); index++)
		{
			names[index] = fruits.get(index).getWord();
		}
		return names;
	}
}
