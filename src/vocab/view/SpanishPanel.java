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
	private JButton backBtnFoods;
	
	//main panels
	private JPanel foodPanel;
	private JPanel verbsPanel;
	private JPanel mainPanel;
	
	//Food Panel
	private JTextArea descriptionArea;
	private JComboBox categoryDropDown;
	private JComboBox itemDropDown;
	private JLabel englishLabel;
	private JLabel spanishLabel;
	private JLabel pictureFruitLabel;
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
		
		//Food panel
		descriptionArea = new JTextArea(5,10);
		categoryDropDown = new JComboBox();
		itemDropDown = new JComboBox();
		
		englishLabel = new JLabel("English:");
		spanishLabel = new JLabel("Spanish:");
		pictureFruitLabel = new JLabel(new ImageIcon(getClass().getResource("/vocab/view/images/default.png")),JLabel.CENTER);
		englishBox = new JTextField();
		spanishBox = new JTextField();
		
		//titles for panels
		titleForMenu = new JLabel("Main Menu");
		titleForVerbs = new JLabel("Verbs In Spanish");
		titleForFood = new JLabel("Foods in Spanish");
		
		foodBtn = new JButton("Foods");	
		verbsBtn = new JButton("Verbs");
		backBtnVerbs = new JButton("Back");
		backBtnFoods = new JButton("Back");
		
		setupComboBox();
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
		
		backBtnFoods.setBounds(413, 404, 81, 29);
		descriptionArea.setBounds(240, 214, 254, 178);
		categoryDropDown.setBounds(240, 40, 254, 30);
		itemDropDown.setEnabled(false);
		itemDropDown.setBounds(240, 72, 254, 30);
		englishLabel.setBounds(240, 114, 65, 30);
		spanishLabel.setBounds(240, 155, 65, 30);
		pictureFruitLabel.setBounds(6, 40, 222, 352);
		englishBox.setBounds(327, 119, 167, 20);
		spanishBox.setBounds(327, 160, 167, 20);
		descriptionArea.setEditable(false);
	}
	
	private void setupListeners()
	{
		categoryDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedFoodIndex = categoryDropDown.getSelectedIndex();
				
				itemDropDown.enable(true);
				updateFoodInfo(selectedFoodIndex);
				updateItemImage();
			}
		});
		itemDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedItemIndex = itemDropDown.getSelectedIndex();
				updateFruitInfo(selectedItemIndex);
				updateItemImage();
			}
		});	
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
		backBtnFoods.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(true);
				foodPanel.setVisible(false);
			}
		});
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel foodModel = new DefaultComboBoxModel(appController.convertFood());
		categoryDropDown.setModel(foodModel);
		
		DefaultComboBoxModel itemModel = new DefaultComboBoxModel(appController.convertItem());
		itemDropDown.setModel(itemModel);
	}
	//Helper Methods
	private void updateItemImage()
	{
		String path = "/vocab/view/images/";
		String defaultName = "fruit";
		String name = itemDropDown.getSelectedItem().toString();
		String extension = ".png";
		
		ImageIcon itemIcon;
		
		try {
			itemIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch(NullPointerException missingImageFile)
		{
			itemIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pictureFruitLabel.setIcon(itemIcon);
		
	}
	
	private void updateFruitInfo(int index)
	{
		englishBox.setText(appController.getFruits().get(index).getEnglishWord());
		spanishBox.setText(appController.getFruits().get(index).getSpanishWord());
		descriptionArea.setText(appController.toString());
	}
	private void updateBakedInfo(int index)
	{
		englishBox.setText(appController.getBakedGoods().get(index).getEnglishWord());
		spanishBox.setText(appController.getBakedGoods().get(index).getSpanishWord());
		descriptionArea.setText(appController.toString());
	}
	private void updateSeafoodInfo(int index)
	{
		englishBox.setText(appController.getSeafoods().get(index).getEnglishWord());
		spanishBox.setText(appController.getSeafoods().get(index).getSpanishWord());
		descriptionArea.setText(appController.toString());
	}
	private void updateMeatInfo(int index)
	{
		englishBox.setText(appController.getMeat().get(index).getEnglishWord());
		spanishBox.setText(appController.getMeat().get(index).getSpanishWord());
		descriptionArea.setText(appController.toString());
	}
	private void updateVegetableInfo(int index)
	{
		englishBox.setText(appController.getVeggies().get(index).getEnglishWord());
		spanishBox.setText(appController.getVeggies().get(index).getSpanishWord());
		descriptionArea.setText(appController.toString());
	}
	private void updateFoodInfo(int index)
	{
		englishBox.setText(appController.getFood().get(index).englishWord());
		spanishBox.setText(appController.getFood().get(index).spanishWord());	
	}
	
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
		foodPanel.add(backBtnFoods);
		foodPanel.add(descriptionArea);
		foodPanel.add(categoryDropDown);
		foodPanel.add(itemDropDown);
		foodPanel.add(englishLabel);
		foodPanel.add(spanishLabel);
		foodPanel.add(englishBox);
		foodPanel.add(spanishBox);
		foodPanel.add(pictureFruitLabel);
		foodPanel.add(backBtnFoods);
		
	}
}
