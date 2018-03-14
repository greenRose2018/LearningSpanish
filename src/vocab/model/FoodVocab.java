package vocab.model;

import java.util.ArrayList;

public class FoodVocab 
{
	private String word;
	private String typeOfFruit;
	
	public FoodVocab(String word, String typeOfFruit)
	{
		this.word = word;
		this.typeOfFruit = typeOfFruit;
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
		return typeOfFruit;
	}
	
	public String getDescription()
	{
		String info = "This is a " + word + " a type of " + typeOfFruit +"." ;
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
