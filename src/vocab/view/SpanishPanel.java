package vocab.view;

import javax.swing.JPanel;
import useful.controller.SpanishController;
import java.awt.*;
import javax.swing.*;

public class SpanishPanel extends JPanel
{
	private SpanishController appController;
	private SpringLayout baseLayout;
	
	private JButton foodBtn;
	private JButton verbsBtn;
	
	private JPanel foodPanel;
	private JPanel verbsPanel;

	public SpanishPanel(SpanishController appController)
	{
		super();
		baseLayout = new SpringLayout();
		
		foodBtn = new JButton("Foods");
		verbsBtn = new JButton("Verbs");
		
		foodPanel = new JPanel();
		verbsPanel = new JPanel();

	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(foodBtn);
		this.add(verbsBtn);
		this.add(foodPanel);
		this.add(verbsPanel);
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}
