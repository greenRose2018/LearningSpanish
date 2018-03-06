package vocab.view;

import javax.swing.JPanel;
import useful.controller.SpanishController;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SpanishPanel extends JPanel
{
	private SpanishController appController;

	//Labels for panels
	private JLabel titleForFood;
	private JLabel titleForMenu;
	private JLabel titleForVerbs;
	
	//main menu btns
	private JButton foodBtn;
	private JButton verbsBtn;
	
	//btns inside of the foodPanel
	private JButton fruitBtn;
	private JButton vegatablesBtn;
	private JButton meatBtn;
	private JButton seafoodBtn;
	private JButton pasteryBtn;
	private JButton bakeryGoodsBtn;
	
	//back btns
	private JButton backBtnVerbs;
	private JButton backBtnFood;
	
	
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
		titleForFood = new JLabel("Foods in Spanish");
		
		foodBtn = new JButton("Foods");	
		verbsBtn = new JButton("Verbs");
		backBtnVerbs = new JButton("Back");
		backBtnFood = new JButton("Back");
		
		fruitBtn = new JButton("Fruits/Frutas");
		vegatablesBtn = new JButton("Vegetables/Vegetales");
		meatBtn = new JButton("Meat/Carne");
		seafoodBtn = new JButton("Seafood/Mariscos");
		pasteryBtn = new JButton("Pastry/Pastel");
		bakeryGoodsBtn = new JButton("Bakery Goods/\r\nProductos de Panader\u00EDa");
		
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
		setupMainMenuPanel();
		
		//FoodPanel
		setupFoodsPanel();
				
		//VerbsPanel 
		setupVerbsPanel();

	}
	private void setupLayout()
	{
		titleForMenu.setHorizontalAlignment(SwingConstants.CENTER);
		titleForMenu.setLocation(208, 6);
		titleForMenu.setSize(83, 37);
		
		titleForVerbs.setLocation(155, 13);
		titleForVerbs.setSize(140, 40);
		titleForVerbs.setHorizontalAlignment(SwingConstants.CENTER);
		
		titleForFood.setHorizontalAlignment(SwingConstants.CENTER);
		titleForFood.setBounds(195, 11, 110, 30);
		
		foodBtn.setBounds(340, 124, 83, 25);
		verbsBtn.setBounds(98, 124, 79, 25);
		backBtnVerbs.setLocation(18, 380);
		backBtnVerbs.setSize(87, 33);
		
		backBtnFood.setBounds(20, 380, 61, 20);
		seafoodBtn.setBounds(301, 130, 149, 20);
		fruitBtn.setLocation(44, 97);
		fruitBtn.setSize(149, 20);
		vegatablesBtn.setBounds(301, 97, 149, 20);
		meatBtn.setBounds(44, 130, 149, 20);
		pasteryBtn.setBounds(44, 161, 149, 20);
		bakeryGoodsBtn.setBounds(116, 260, 279, 20);
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
		foodBtn.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(false);
				foodPanel.setVisible(true);
			}
				});
		backBtnVerbs.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(true);
				verbsPanel.setVisible(false);
			}
			
		});
		backBtnFood.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(true);
				foodPanel.setVisible(false);
			}
		});
	}
	//Helper Methods
	private void setupMainMenuPanel()
	{
		this.add(mainPanel, "name_364289695107993");
		mainPanel.setLayout(null);
		mainPanel.add(verbsBtn);
		mainPanel.add(foodBtn);
		mainPanel.add(titleForMenu);
	}
	private void setupVerbsPanel()
	{
		this.add(verbsPanel, "name_364289744103657");
		verbsPanel.setVisible(false);
		verbsPanel.add(titleForVerbs);
		verbsPanel.add(backBtnVerbs);
	}
	private void setupFoodsPanel()
	{
		this.add(foodPanel, "name_364289733314566");
		foodPanel.add(titleForFood);
		foodPanel.setVisible(false);
		foodPanel.add(backBtnFood);
		foodPanel.add(fruitBtn);
		foodPanel.add(vegatablesBtn);
		foodPanel.add(meatBtn);
		foodPanel.add(seafoodBtn);
		foodPanel.add(pasteryBtn);
		foodPanel.add(bakeryGoodsBtn);
	}
}
