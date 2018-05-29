package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class Screen extends TechnicalWords implements Technical
{

	public Screen() 
	{
		super("Monitor (Screen)", "La pantalla", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}
//screenmonitor

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Monitor (Screen)";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "La pantalla";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}
}
