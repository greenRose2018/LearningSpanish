package vocab.view;

import javax.swing.JPanel;
import useful.controller.SpanishController;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SpanishPanel extends JPanel
{
	private SpanishController appController;
	
	private SpringLayout techLayout;

	//Labels for panels
	private JLabel titleForFood;
	private JLabel titleForMenu;
	private JLabel titleForTech;
	
	//main menu btns
	private JButton foodBtn;
	private JButton techBtn;
	
	//back btns
	private JButton backBtnFoods;
	private JButton backBtnTech;
	
	//main panels
	private JPanel foodPanel;
	private JPanel mainPanel;
	private JPanel techPanel;
	
	//Food Panel
	private JTextArea descriptionArea;
	private JComboBox categoryDropDown;
	private JComboBox itemDropDown;
	private JLabel englishLabel;
	private JLabel spanishLabel;
	private JLabel pictureFruitLabel;
	private JLabel category;
	private JLabel item;
	private JLabel infoMainMenu;
	private JTextField englishBox;
	private JTextField spanishBox;
	
	//Tech Panel
	private JComboBox cateTechDropDown;
	private JComboBox itemTechDropDown;
	private JLabel engLT;
	private JLabel spanLT;
	private JLabel pictureTechLabel;
	private JTextField engTBox;
	private JTextField spanTBox;
	

	public SpanishPanel(SpanishController appController)
	{
		super();
		this.appController = appController;
		
		techLayout = new SpringLayout();
		
		//main panels
		mainPanel = new JPanel();
		foodPanel = new JPanel();
		techPanel = new JPanel();
		
		//Food panel
		descriptionArea = new JTextArea(5,10);
		categoryDropDown = new JComboBox();
		itemDropDown = new JComboBox();
		
		englishLabel = new JLabel("English:");
		spanishLabel = new JLabel("Spanish:");
		category = new JLabel("Choose a Category:");
		item = new JLabel("Choose an Item:");
		infoMainMenu = new JLabel("Click a button to start Learning Vocabulary!");
		englishBox = new JTextField();
		spanishBox = new JTextField();
		
		//titles for panels
		titleForMenu = new JLabel("Main Menu");
		titleForFood = new JLabel("Foods in Spanish");
		titleForTech = new JLabel("Technical Terms in Spanish");
		
		pictureFruitLabel = new JLabel(new ImageIcon(getClass().getResource("/vocab/view/images/default.png")),JLabel.CENTER);
		//main panel
		foodBtn = new JButton("Foods");	
		techBtn = new JButton("Technical Words");
		
		//backbtns
		backBtnFoods = new JButton("Back");
		backBtnTech = new JButton("Back");
		
		// techpanel
		cateTechDropDown = new JComboBox();
		itemTechDropDown = new JComboBox();
		engLT = new JLabel("English:");
		spanLT = new JLabel("Spanish:");
		pictureTechLabel = new JLabel(new ImageIcon(getClass().getResource("/vocab/view/images/default.png")), JLabel.CENTER);
		
		engTBox = new JTextField();
		spanTBox = new JTextField();
		
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
		techPanel.setLayout(techLayout);
		
		//mainPanel
		setupMainMenuPanel();
		
		//FoodPanel
		setupFoodsPanel();
		
		//TechPanel
		setupTechPanel();
	}

	private void setupLayout()
	{
		infoMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		titleForMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		techBtn.setBounds(79, 194, 111, 79);
		techLayout.putConstraint(SpringLayout.SOUTH, backBtnTech, -10, SpringLayout.SOUTH, techPanel);
		techLayout.putConstraint(SpringLayout.EAST, backBtnTech, -10, SpringLayout.EAST, techPanel);
		
		techLayout.putConstraint(SpringLayout.SOUTH, cateTechDropDown, -364, SpringLayout.SOUTH, techPanel);
		techLayout.putConstraint(SpringLayout.EAST, cateTechDropDown, -45, SpringLayout.EAST, techPanel);
		techLayout.putConstraint(SpringLayout.NORTH, itemTechDropDown, 30, SpringLayout.SOUTH, cateTechDropDown);
		techLayout.putConstraint(SpringLayout.WEST, itemTechDropDown, 283, SpringLayout.WEST, techPanel);
		techLayout.putConstraint(SpringLayout.EAST, itemTechDropDown, 0, SpringLayout.EAST, cateTechDropDown);
		techLayout.putConstraint(SpringLayout.WEST, titleForTech, -165, SpringLayout.EAST, engLT);
		techLayout.putConstraint(SpringLayout.NORTH, spanLT, 255, SpringLayout.NORTH, techPanel);
		techLayout.putConstraint(SpringLayout.EAST, engLT, 0, SpringLayout.EAST, spanLT);
		techLayout.putConstraint(SpringLayout.NORTH, titleForTech, -36, SpringLayout.NORTH, pictureTechLabel);
		techLayout.putConstraint(SpringLayout.SOUTH, titleForTech, -6, SpringLayout.NORTH, pictureTechLabel);
		techLayout.putConstraint(SpringLayout.WEST, cateTechDropDown, 43, SpringLayout.EAST, pictureTechLabel);
		techLayout.putConstraint(SpringLayout.WEST, spanLT, 39, SpringLayout.EAST, pictureTechLabel);
		techLayout.putConstraint(SpringLayout.NORTH, pictureTechLabel, 59, SpringLayout.NORTH, techPanel);
		techLayout.putConstraint(SpringLayout.WEST, pictureTechLabel, 10, SpringLayout.WEST, techPanel);
		techLayout.putConstraint(SpringLayout.SOUTH, pictureTechLabel, -50, SpringLayout.SOUTH, techPanel);
		techLayout.putConstraint(SpringLayout.EAST, pictureTechLabel, -260, SpringLayout.EAST, techPanel);
		techLayout.putConstraint(SpringLayout.WEST, engTBox, 21, SpringLayout.EAST, engLT);
		techLayout.putConstraint(SpringLayout.SOUTH, engTBox, -229, SpringLayout.SOUTH, techPanel);
		techLayout.putConstraint(SpringLayout.EAST, engTBox, -49, SpringLayout.EAST, techPanel);
		techLayout.putConstraint(SpringLayout.NORTH, engLT, 3, SpringLayout.NORTH, engTBox);
		
		techLayout.putConstraint(SpringLayout.NORTH, spanTBox, 252, SpringLayout.NORTH, techPanel);
		techLayout.putConstraint(SpringLayout.WEST, spanTBox, 21, SpringLayout.EAST, spanLT);
		techLayout.putConstraint(SpringLayout.EAST, spanTBox, -49, SpringLayout.EAST, techPanel);
		
		techLayout.putConstraint(SpringLayout.EAST, titleForTech, -154, SpringLayout.EAST, techPanel);
		titleForTech.setHorizontalAlignment(SwingConstants.CENTER);
		titleForTech.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		category.setBounds(92, 44, 122, 20);
		item.setBounds(112, 76, 116, 20);
		infoMainMenu.setBounds(131, 124, 264, 30);
		
		titleForMenu.setHorizontalAlignment(SwingConstants.CENTER);
		titleForMenu.setLocation(190, 11);
		titleForMenu.setSize(128, 68);
		
		titleForFood.setHorizontalAlignment(SwingConstants.CENTER);
		titleForFood.setBounds(195, 11, 110, 30);
		
		foodBtn.setBounds(284, 194, 111, 79);
		
		backBtnFoods.setBounds(413, 404, 81, 29);
		descriptionArea.setBounds(240, 214, 254, 178);
		categoryDropDown.setBounds(240, 40, 254, 30);
		itemDropDown.setEnabled(false);
		itemDropDown.setBounds(240, 72, 254, 30);
		englishLabel.setBounds(240, 114, 65, 30);
		spanishLabel.setBounds(240, 155, 65, 30);
		pictureFruitLabel.setBounds(6, 110, 222, 282);
		englishBox.setBounds(327, 119, 167, 20);
		spanishBox.setBounds(327, 160, 167, 20);
		descriptionArea.setEditable(false);
	}
	
	private void setupListeners()
	{
		//startComplexity
		categoryDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = categoryDropDown.getSelectedIndex();
				
				itemDropDown.enable(true);
				
				updateDropDown(selected);				
				updateFoodInfo(selected);
				updateItemImage();
			}
		});
		//endComplexity
		itemTechDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				itemTechDropDown();
				updateTechItemImage();
			}
		});	
		
		cateTechDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = cateTechDropDown.getSelectedIndex();
				
				itemTechDropDown.enable(true);
				
				updateTechDropDown(selected);				
				updateComputerInfo(selected);
				updateTechItemImage();
			}
		});
		itemDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				itemDropDown();
				updateItemImage();
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
	
		techBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(false);
				techPanel.setVisible(true);
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
		
		backBtnTech.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(true);
				techPanel.setVisible(false);
			}
		});
	}
	//startComplexity
	private void itemDropDown() 
	{
		int selected = categoryDropDown.getSelectedIndex();
		int selectedItemIndex = itemDropDown.getSelectedIndex();
		if(selected == 0)
		{
			updateBakedInfo(selectedItemIndex);
		}
		else if(selected == 1)
		{
			updateMeatInfo(selectedItemIndex);
		}
		else if(selected == 2)
		{
			updateSeafoodInfo(selectedItemIndex);
		}
		else if(selected == 3)
		{
			updateVegetableInfo(selectedItemIndex);
		}
		else if(selected == 4)
		{
			updateFruitInfo(selectedItemIndex);	
		}
	}
	//endComplexity
	private void itemTechDropDown() 
	{
		int selected = cateTechDropDown.getSelectedIndex();
		int selectedItemIndex = itemTechDropDown.getSelectedIndex();
		if(selected == 0)
		{
			updateEngineeringInfo(selectedItemIndex);
		}
		else if(selected == 1)
		{
			updateScienceInfo(selectedItemIndex);
		}
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel foodModel = new DefaultComboBoxModel(appController.convertFood());
		categoryDropDown.setModel(foodModel);
		
		DefaultComboBoxModel itemModel = new DefaultComboBoxModel(appController.convertBakedGoods());
		itemDropDown.setModel(itemModel);
		
		DefaultComboBoxModel techModel = new DefaultComboBoxModel(appController.convertComputer());
		cateTechDropDown.setModel(techModel);
		
		DefaultComboBoxModel itemTechModel = new DefaultComboBoxModel(appController.convertEngineer());
		itemTechDropDown.setModel(itemTechModel);
		
	}
	
	//Helper Methods
	//startComplexity
	private void updateDropDown(int selected)
	{
		if(selected == 0)
		{
			DefaultComboBoxModel baked = new DefaultComboBoxModel(appController.convertBakedGoods());
			itemDropDown.setModel(baked);
		}
		else if(selected == 1)
		{
			DefaultComboBoxModel meat = new DefaultComboBoxModel(appController.convertMeats());
			itemDropDown.setModel(meat);
		}
		else if(selected == 2)
		{
			DefaultComboBoxModel seafood = new DefaultComboBoxModel(appController.convertSeafood());
			itemDropDown.setModel(seafood);
		}
		else if(selected == 3)
		{
			DefaultComboBoxModel veggies = new DefaultComboBoxModel(appController.convertVeggies());
			itemDropDown.setModel(veggies);
		}
		else if(selected == 4)
		{
			DefaultComboBoxModel fruit = new DefaultComboBoxModel(appController.convertItem());
			itemDropDown.setModel(fruit);
		}
	}
	//endComplexity
	private void updateTechDropDown(int selected)
	{
		if(selected == 0)
		{
			DefaultComboBoxModel engineer = new DefaultComboBoxModel(appController.convertEngineer());
			itemTechDropDown.setModel(engineer);
		}
		else if(selected == 1)
		{
			DefaultComboBoxModel science = new DefaultComboBoxModel(appController.convertScience());
			itemTechDropDown.setModel(science);
		}
	}
	
	private void updateItemImage()
	{
		String path = "/vocab/view/images/";
		String defaultName = "default";
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
	private void updateTechItemImage()
	{
		String path = "/vocab/view/images/";
		String defaultName = "default";
		String name = itemTechDropDown.getSelectedItem().toString().trim();
		String extension = ".png";
		
		ImageIcon itemIcon;
		
		try {
			itemIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch(NullPointerException missingImageFile)
		{
			itemIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pictureTechLabel.setIcon(itemIcon);
		
	}
	
	private void updateFruitInfo(int index)
	{
		englishBox.setText(appController.getFruits().get(index).getEnglishWord());
		spanishBox.setText(appController.getFruits().get(index).getSpanishWord());
		descriptionArea.setText(appController.getFruits().get(index).getDescription());
	}
	private void updateBakedInfo(int index)
	{
		englishBox.setText(appController.getBakedGoods().get(index).getEnglishWord());
		spanishBox.setText(appController.getBakedGoods().get(index).getSpanishWord());
		descriptionArea.setText(appController.getBakedGoods().get(index).getDescription());
	}
	private void updateSeafoodInfo(int index)
	{
		englishBox.setText(appController.getSeafoods().get(index).getEnglishWord());
		spanishBox.setText(appController.getSeafoods().get(index).getSpanishWord());
		descriptionArea.setText(appController.getSeafoods().get(index).getDescription());
	}
	private void updateMeatInfo(int index)
	{
		englishBox.setText(appController.getMeat().get(index).getEnglishWord());
		spanishBox.setText(appController.getMeat().get(index).getSpanishWord());
		descriptionArea.setText(appController.getMeat().get(index).getDescription());
	}
	private void updateVegetableInfo(int index)
	{
		englishBox.setText(appController.getVeggies().get(index).getEnglishWord());
		spanishBox.setText(appController.getVeggies().get(index).getSpanishWord());
		descriptionArea.setText(appController.getVeggies().get(index).getDescription());
	}
	private void updateFoodInfo(int index)
	{
		englishBox.setText(appController.getFood().get(index).englishWord());
		spanishBox.setText(appController.getFood().get(index).spanishWord());	
	}
	private void updateComputerInfo(int index)
	{	
		engTBox.setText(appController.getComputerList().get(index).getEnglishWord());
		engTBox.setText(appController.getComputerList().get(index).getSpanishWord());
	}private void updateScienceInfo(int index)
	{
		engTBox.setText(appController.getComputerScienceList().get(index).englishWord());
		spanTBox.setText(appController.getComputerScienceList().get(index).spanishWord());	
	}private void updateEngineeringInfo(int index)
	{
		engTBox.setText(appController.getComputerEngineeringList().get(index).englishWord());
		spanTBox.setText(appController.getComputerEngineeringList().get(index).spanishWord());	
	}
	
	private void setupMainMenuPanel()
	{
		this.add(mainPanel, "name_364289695107993");
		mainPanel.setLayout(null);
		mainPanel.add(foodBtn);
		mainPanel.add(techBtn);
		mainPanel.add(titleForMenu);
		mainPanel.add(infoMainMenu);
	}
	
	private void setupFoodsPanel()
	{
		this.add(foodPanel, "name_364289733314566");
		foodPanel.add(titleForFood);
		foodPanel.setVisible(false);
		foodPanel.add(descriptionArea);
		foodPanel.add(categoryDropDown);
		foodPanel.add(itemDropDown);
		foodPanel.add(englishLabel);
		foodPanel.add(spanishLabel);
		foodPanel.add(englishBox);
		foodPanel.add(spanishBox);
		foodPanel.add(pictureFruitLabel);
		foodPanel.add(backBtnFoods);
		foodPanel.add(category);
		foodPanel.add(item);
		
	}
	
	private void setupTechPanel()
	{
		this.add(techPanel);
		techPanel.setVisible(false);
		techPanel.add(titleForTech);
		techPanel.add(backBtnTech);
		techPanel.add(engLT);
		techPanel.add(spanLT);
		techPanel.add(cateTechDropDown);
		techPanel.add(itemTechDropDown);
		techPanel.add(engTBox);
		techPanel.add(spanTBox);
		techPanel.add(pictureTechLabel);
	}
}
