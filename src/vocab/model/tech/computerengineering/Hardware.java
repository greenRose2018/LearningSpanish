package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class Hardware extends TechnicalWords implements Technical
{

	public Hardware() 
	{
		super("Hardware", "El hardware", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Hardware";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "El hardware";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}

}
