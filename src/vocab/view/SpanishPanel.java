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
	
	//back btns
	private JButton backBtnVerbs;
	private JButton backBtnFood;
	
	//main panels
	private JPanel foodPanel;
	private JPanel verbsPanel;
	private JPanel mainPanel;
	
	//Food Panel
	private JTextArea descriptionArea;
	private JComboBox catergoryDropDown;
	private JComboBox itemDropDown;
	private JLabel englishLabel;
	private JLabel spanishLabel;
	private JLabel pictureLabel;
	private JTextField englishBox;
	private JTextField spanishBox;
	

	public SpanishPanel(SpanishController appController)
	{
		super();
		this.appController = appController;
		
		//main panels
		mainPanel = new JPanel();
		foodPanel = new JPanel();
		verbsPanel = new JPanel();
		
		//under food panel
		descriptionArea = new JTextArea(5,10);
		catergoryDropDown = new JComboBox();
		itemDropDown = new JComboBox();
		englishLabel = new JLabel();
		spanishLabel = new JLabel();
		pictureLabel = new JLabel(new ImageIcon(getClass().getResource("/vocab/view/images/default.png")),JLabel.CENTER);
		englishBox = new JTextField();
		spanishBox = new JTextField();
		
		//titles for panels
		titleForMenu = new JLabel("Main Menu");
		titleForVerbs = new JLabel("Verbs In Spanish");
		titleForFood = new JLabel("Foods in Spanish");
		
		foodBtn = new JButton("Foods");	
		verbsBtn = new JButton("Verbs");
		backBtnVerbs = new JButton("Back");
		backBtnFood = new JButton("Back");
		
		//btns on the foodPanel
		
		
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
		verbsBtn.setBounds(89, 124, 79, 25);
		backBtnVerbs.setLocation(18, 380);
		backBtnVerbs.setSize(87, 33);
		
		backBtnFood.setBounds(20, 380, 61, 20);
		
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
	}
}
