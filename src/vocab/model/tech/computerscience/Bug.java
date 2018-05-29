package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class Bug extends TechnicalWords implements Technical
{

	public Bug() 
	{
		super("Bug" , "El error de programacion", "Computer Science");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Bug";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "El error de programacion";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

}
