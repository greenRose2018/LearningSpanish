package vocab.view;

import useful.controller.SpanishController;
import javax.swing.JFrame;

public class SpanishFrame extends JFrame
{
	private SpanishController appController;
	private SpanishPanel mainMenuPanel;	
	
	public SpanishFrame(SpanishController appController)
	{
		super();
		this.setAppController(appController);
		mainMenuPanel = new SpanishPanel(appController);
		setupFrame();
		
	}
	private void setupFrame()
	{
		this.setContentPane(mainMenuPanel);
		this.setSize(500, 450);
		this.setTitle("Main Menu");
		this.setSize(500,450);
		this.setResizable(false);
		this.setVisible(true);
	}
	public SpanishController getAppController()
	{
		return appController;
	}
	public void setAppController(SpanishController appController)
	{
		this.appController = appController;
	}
}
