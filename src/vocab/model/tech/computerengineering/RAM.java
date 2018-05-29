package vocab.model.tech.computerengineering;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class RAM extends TechnicalWords implements Technical
{

	public RAM() 
	{
		super("RAM (Random Access Memory)", "La RAM (Memoria de acceso aleatorio)", "Computer Engineering");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "RAM (Random Access Memory)";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "La RAM (Memoria de acceso aleatorio)";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Engineering";
	}

}
