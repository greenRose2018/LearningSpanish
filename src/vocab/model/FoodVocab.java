package vocab.model;

import java.util.ArrayList;

public class FoodVocab 
{
	private String word;
	private String typeOfFood;
	
	public FoodVocab(String word, String typeOfFood)
	{
		this.word = word;
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
	
	public String getWord()
	{
		return word;
	}
	
	public String getTypeOfFruit()
	{
		return typeOfFood;
	}
	
	public String getDescription()
	{
		String info = "This is a " + word + " a type of " + typeOfFood +"." ;
		return info;
	}
	
	public void setWord(String word)
	{
		this.word = word;
	}
	
	public String toString()
	{
		String response = "";
		return response;
	}
}
