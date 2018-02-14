package vocab.view;

import useful.controller.SpanishController;
import vocab.view.SpanishPanel;
import javax.swing.JFrame;

public class SpanishFrame extends JFrame
{
	private SpanishController appController;
	private SpanishPanel mainMenuPanel;
	private SpanishPanel translationPanel;
	private SpanishPanel verbsPanel;
	private SpanishPanel foodPanel;
	private SpanishPanel mainPanel;
	
	
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
//		this.getContentPane().add(mainPanel, "0");
//		this.getContentPane().add(foodPanel, "1");
//		this.getContentPane().add(verbsPanel, "2");
		
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
