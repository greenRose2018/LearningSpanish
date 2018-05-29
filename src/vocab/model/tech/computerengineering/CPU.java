package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class CPU extends TechnicalWords implements Technical
{

	public CPU() {
		super("CPU (Central Processing Unit)", "La CPU (Unidad central de procesamiento)", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "CPU (Central Processing Unit)";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "La CPU (Unidad central de procesamiento)";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}

}
