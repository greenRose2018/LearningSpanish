package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class ComputerEngineering extends TechnicalWords implements Technical
{

	public ComputerEngineering(String englishWord, String spanishWord, String typeOfTech) {
		super(englishWord, spanishWord, typeOfTech);
	}
	
	public ComputerEngineering( String spanishWord, String typeOfTech) {
		super("Computer Engineering", spanishWord, typeOfTech);
	}

	public ComputerEngineering( String typeOfTech) {
		super("Computer Engineering", "Ingeniería Informática", typeOfTech);
	}
	public ComputerEngineering() {
		super("Computer Engineering", "Ingeniería Informática", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}

	public String englishWord() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}

	public String spanishWord() {
		// TODO Auto-generated method stub
		return "Ingeniería Informática";
	}

	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}
	

}
