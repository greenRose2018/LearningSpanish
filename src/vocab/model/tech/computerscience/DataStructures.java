package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class DataStructures extends TechnicalWords implements Technical
{

	public DataStructures() 
	{
		super("Data Structures", "Estructuras de datos", "Computer Science");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Data Structures";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "Estructuras de datos";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

}
