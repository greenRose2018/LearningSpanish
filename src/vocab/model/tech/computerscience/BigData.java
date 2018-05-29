package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.*;

public class BigData extends ComputerScience
{
//	public BigData(String englishWord, String spanishWord, String typeOfTech) 
//	{
//		super(englishWord, spanishWord, typeOfTech);
//	}
//	public BigData(String spanishWord, String typeOfTech) 
//	{
//		super("Big Data", spanishWord, typeOfTech);
//	}
//	public BigData(String typeOfTech) 
//	{
//		super("Big Data", "Grandes Datos", typeOfTech);
//	}
	public BigData() 
	{
		super("Big Data", "Grandes Datos", "Computer Science");
	}

	public String englishWord() 
	{
		return "Big Data";
	}

	public String spanishWord() 
	{
		return "Grandes Datos";
	}

	public String categoryTech() 
	{
		return "Computer Science";
	}

}
