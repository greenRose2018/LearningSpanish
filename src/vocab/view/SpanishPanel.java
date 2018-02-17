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
		titleForFood.setHorizontalAlignment(SwingConstants.CENTER);
		titleForFood.setBounds(170, 11, 110, 30);
		
		foodBtn = new JButton("Foods");	
		verbsBtn = new JButton("Verbs");
		backBtnVerbs = new JButton("Back");
		backBtnFood = new JButton("Back");
		backBtnFood.setBounds(379, 269, 61, 20);
		
		fruitBtn = new JButton("Fruits/Frutas");
		fruitBtn.setLocation(44, 97);
		fruitBtn.setSize(149, 20);
		vegatablesBtn = new JButton("Vegetables/Vegetales");
		vegatablesBtn.setBounds(233, 97, 149, 20);
		meatBtn = new JButton("Meat/Carne");
		meatBtn.setBounds(44, 130, 149, 20);
		seafoodBtn = new JButton("Seafood/Mariscos");
		seafoodBtn.setBounds(233, 128, 149, 20);
		pasteryBtn = new JButton("Pastry/Pastel");
		pasteryBtn.setBounds(44, 161, 149, 20);
		bakeryGoodsBtn = new JButton("Bakery Goods/\r\nProductos de Panader\u00EDa");
		bakeryGoodsBtn.setBounds(233, 159, 149, 20);
		
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
		titleForMenu.setLocation(182, 13);
		titleForMenu.setSize(83, 37);
		
		titleForVerbs.setLocation(155, 13);
		titleForVerbs.setSize(140, 40);
		titleForVerbs.setHorizontalAlignment(SwingConstants.CENTER);
		
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
