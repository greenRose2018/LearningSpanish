package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class Code extends TechnicalWords implements Technical
{

	public Code() 
	{
		super("Code", "El codigo", "Computer Science");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Code";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "El codigo";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

}
