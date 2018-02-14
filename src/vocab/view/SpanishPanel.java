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
	private JPanel mainPanel;

	public SpanishPanel(SpanishController appController)
	{
		super();
		this.appController = appController;
		baseLayout = new SpringLayout();
		mainPanel = new JPanel();
		
		foodBtn = new JButton("Foods");
		
		foodBtn.setBounds(226, 100, 67, 25);
		
		verbsBtn = new JButton("Verbs");
		
		verbsBtn.setBounds(63, 100, 65, 25);
		
		foodPanel = new JPanel();
		verbsPanel = new JPanel();
		
		setupPanel();
	}
	private void setupPanel()
	{
		
		//mainPanel
		this.add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.add(verbsBtn);
		mainPanel.add(foodBtn);
		
		//FoodPanel
		this.add(foodPanel);
		foodPanel.setLayout(null);
		
		//VerbsPanel 
		this.add(verbsPanel);
		verbsPanel.setLayout(null);
		
		this.setLayout(baseLayout);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, mainPanel, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, mainPanel, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, mainPanel, 0, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, mainPanel, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, foodBtn, 101, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, foodBtn, -314, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, verbsBtn, 0, SpringLayout.NORTH, foodBtn);
		baseLayout.putConstraint(SpringLayout.WEST, verbsBtn, 33, SpringLayout.EAST, foodBtn);
		baseLayout.putConstraint(SpringLayout.NORTH, foodPanel, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, foodPanel, 40, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, verbsPanel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, verbsPanel, 10, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		
	}
}
