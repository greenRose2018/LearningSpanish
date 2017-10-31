package useful.controller;

public class VocabController
{
	private String[] myWords = {"Ryan", "mason", "Sheradon", "Preston"};
	private int[] myNumbers;
	public VocabController()
	{
		myWords = new String[6];
		myNumbers = new int[8];
	}
	
	public void start()
	{
		System.out.println("My name is Brittney, and I am a student");
		System.out.println(myWords);
		System.out.println(myNumbers);
		myWords = new String [] { "Brandon", "Zane", "Amber", "Brittney", "Jeran",  "Dylan"};
		for (int index = 0; index < myNumbers.length; index += 1)
		{
			myNumbers[index] = index + 1;
		}
		
		showLoopWithArray();
	}
	
	private void showLoopWithArray()
	{
		for (String current : myWords)
		{
			System.out.println(current);
		}
		
		for (int index = 0; index < myNumbers.length; index += 1)
		{
			System.out.println(myNumbers[index]);
		}
	}

}
