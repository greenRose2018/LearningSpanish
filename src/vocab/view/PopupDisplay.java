package vocab.view;

import javax.swing.JOptionPane;

public class PopupDisplay 
{
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String userInput)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null,userInput);
		
		return response;
	}
	
}
