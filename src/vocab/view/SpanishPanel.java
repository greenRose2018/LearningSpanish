package vocab.view;

import javax.swing.JPanel;
import useful.controller.SpanishController;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SpanishPanel extends JPanel
{
	private SpanishController appController;
	private SpringLayout baseLayout;
	
	private JLabel titleForMenu;
	private JLabel titleForVerbs;
	
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
		
		titleForMenu = new JLabel("Main Menu");
		titleForMenu.setHorizontalAlignment(SwingConstants.CENTER);
		titleForMenu.setLocation(165, 33);
		titleForMenu.setSize(83, 37);
		titleForMenu.setBackground(Color.GRAY);
		titleForVerbs = new JLabel("Verbs In Spanish");
		titleForVerbs.setLocation(250, 225);
		titleForVerbs.setSize(140, 40);

		foodBtn = new JButton("Foods");	
		foodBtn.setBounds(238, 83, 116, 25);

		verbsBtn = new JButton("Verbs");
		verbsBtn.setBounds(96, 83, 90, 25);
		
		foodPanel = new JPanel();
		foodPanel.setLayout(null);
		
		verbsPanel = new JPanel();
		verbsPanel.setLayout(null);
		
		
		setupPanel();
		setupLayout();
	}
	private void setupPanel()
	{
		//Layout
		this.setLayout(baseLayout);
		
		//mainPanel
		this.add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.add(verbsBtn);
		mainPanel.add(foodBtn);
		mainPanel.add(titleForMenu);
		
		//FoodPanel
		this.add(foodPanel);
		foodPanel.setVisible(false);
				
		//VerbsPanel 
		this.add(verbsPanel);
		verbsPanel.setVisible(false);
		verbsPanel.add(titleForVerbs);

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
