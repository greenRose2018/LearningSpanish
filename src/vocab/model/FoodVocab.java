package vocab.model;

import java.util.ArrayList;

public class FoodVocab 
{
	private String englishWord;
	private String spanishWord;
	private String typeOfFood;
	
	public FoodVocab(String englishWord, String spanishWord,String typeOfFood)
	{
		this.englishWord = englishWord;
		this.spanishWord = spanishWord;
		this.typeOfFood = typeOfFood;
	}
	
	/**
	 * @return the spanishWord
	 */
	public String getSpanishWord()
	{
		return spanishWord;
	}

	/**
	 * @param spanishWord the spanishWord to set
	 */
	public void setSpanishWord(String spanishWord)
	{
		this.spanishWord = spanishWord;
	}
	
	public String getEnglishWord()
	{
		return englishWord;
	}
	
	public String getTypeOfFruit()
	{
		return typeOfFood;
	}
	
	public String getDescription()
	{
		String info = "This is a " + englishWord + " a type of " + "\n" + typeOfFood +"." ;
		return info;
	}
	
	public void setEnglishWord(String word)
	{
		this.englishWord = word;
	}
	
	public String toString()
	{
		String response = "";
		return response;
	}
}
