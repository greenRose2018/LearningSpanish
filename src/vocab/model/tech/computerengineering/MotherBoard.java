package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class MotherBoard extends TechnicalWords implements Technical{

	public MotherBoard()
	{
		super("Mother Board", "La placa madre", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Mother Board";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "La placa madre";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}

}
