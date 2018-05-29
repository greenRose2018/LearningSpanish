package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class ComputerEngineering extends TechnicalWords implements Technical
{

	public ComputerEngineering() {
		super("Computer Engineering", "Ingeniería Informática", "Computer Engineering");
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
		return "Ingeniería Informática";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}
	

}
