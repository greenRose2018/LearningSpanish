package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class ComputerEngineering extends TechnicalWords implements Technical
{

	public ComputerEngineering() {
		super("Computer Engineering", "Ingenier�a Inform�tica", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "Ingenier�a Inform�tica";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}
	

}
