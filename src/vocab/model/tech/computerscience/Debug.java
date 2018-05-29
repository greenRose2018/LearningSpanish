package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class Debug extends TechnicalWords implements Technical
{

	public Debug() {
		super("Debug", "Depurar", "Computer Science");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Debug";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "Depurar";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

}
