package vocab.view;

import javax.swing.JPanel;
import useful.controller.SpanishController;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SpanishPanel extends JPanel
{
	private SpanishController appController;
	
	private JLabel titleForMenu;
	private JLabel titleForVerbs;
	
	private JButton foodBtn;
	private JButton verbsBtn;
	private JButton backBtnVerbs;
	
	private JPanel foodPanel;
	private JPanel verbsPanel;
	private JPanel mainPanel;

	public SpanishPanel(SpanishController appController)
	{
		super();
		this.appController = appController;
		
		mainPanel = new JPanel();
		foodPanel = new JPanel();
		verbsPanel = new JPanel();
		
		titleForMenu = new JLabel("Main Menu");
		titleForVerbs = new JLabel("Verbs In Spanish");
		titleForVerbs.setHorizontalAlignment(SwingConstants.CENTER);

		foodBtn = new JButton("Foods");	
		verbsBtn = new JButton("Verbs");
		backBtnVerbs = new JButton("Back");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		//layout
		setLayout(new CardLayout(0, 0));		
		mainPanel.setLayout(null);
		foodPanel.setLayout(null);
		verbsPanel.setLayout(null);
		
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
		titleForMenu.setHorizontalAlignment(SwingConstants.CENTER);
		titleForMenu.setLocation(182, 13);
		titleForMenu.setSize(83, 37);
		
		titleForVerbs.setLocation(155, 13);
		titleForVerbs.setSize(140, 40);
		
		foodBtn.setBounds(231, 83, 116, 25);
		verbsBtn.setBounds(90, 83, 90, 25);
		backBtnVerbs.setLocation(351, 254);
		backBtnVerbs.setSize(87, 33);
		
		
	}
	private void setupListeners()
	{
		verbsBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(false);
				verbsPanel.setVisible(true);
			}
		});
		this.add(mainPanel, "name_364289695107993");
		this.add(verbsPanel, "name_364289744103657");
		this.add(foodPanel, "name_364289733314566");
	}
}
