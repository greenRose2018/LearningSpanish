package vocab.model.tech.computerscience;

import vocab.model.TechnicalWords;
import vocab.model.interfaces.Technical;

public class ControlPanel extends TechnicalWords implements Technical
{

	public ControlPanel() {
		super("Control Panel", "Panel de Control", "Computer Science");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String englishWord() {
		// TODO Auto-generated method stub
		return "Control Panel";
	}

	@Override
	public String spanishWord() {
		// TODO Auto-generated method stub
		return "Panel de Control";
	}

	@Override
	public String categoryTech() {
		// TODO Auto-generated method stub
		return "Computer Science";
	}

}
