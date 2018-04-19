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
	
	public String[] getFoodType()
	{
		String [] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] foodTypes = currentClass.getInterfaces();
			types = new String[foodTypes.length];
			
			for(int index = 0; index < types.length; index++)
			{
				String currentInterface = foodTypes[index].getCanonicalName();
				String packageName = foodTypes[index].getPackage().getName() + ".";
				currentInterface = currentInterface.replace(packageName, "");
				if(!parentType.contains(currentInterface))
				{
					parentType.add(currentInterface);
				}
			}
			
			currentClass = currentClass.getSuperclass();
		}
		
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		
		return types;
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
		String info = "This is a " + englishWord + " a type of " + "\n"+ typeOfFood +"." ;
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
