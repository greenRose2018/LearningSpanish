package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class ComputerScience extends TechnicalWords implements Technical
{

	public ComputerScience(String englishWord, String spanishWord, String typeOfTech) {
		super(englishWord, spanishWord, typeOfTech);
		// TODO Auto-generated constructor stub
	}
	public ComputerScience(String spanishWord, String typeOfTech) {
		super("Computer Science", spanishWord, typeOfTech);
		// TODO Auto-generated constructor stub
	}
	public ComputerScience(String typeOfTech) {
		super("Computer Science", "Ciencias de la Computaci�n", typeOfTech);
		// TODO Auto-generated constructor stub
	}
	
	public ComputerScience() {
		super("Computer Science", "Ciencias de la Computaci�n", "Computer Science");
		// TODO Auto-generated constructor stub
	}
	
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

	public String spanishWord() {
		// TODO Auto-generated method stub
		return "Ciencias de la Computaci�n";
	}

	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

}
