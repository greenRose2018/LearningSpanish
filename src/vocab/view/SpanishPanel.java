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
	
	//main menu btns
	private JButton foodBtn;
	
	//btns inside of the foodPanel
	
	//back btns
	private JButton backBtnFoods;
	
	//main panels
	private JPanel foodPanel;
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
		titleForFood = new JLabel("Foods in Spanish");
		
		foodBtn = new JButton("Foods");	
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
		
		//mainPanel
		setupMainMenuPanel();
		
		//FoodPanel
		setupFoodsPanel();
		
	}

	private void setupLayout()
	{
		titleForMenu.setHorizontalAlignment(SwingConstants.CENTER);
		titleForMenu.setLocation(208, 6);
		titleForMenu.setSize(83, 37);
		
		titleForFood.setHorizontalAlignment(SwingConstants.CENTER);
		titleForFood.setBounds(195, 11, 110, 30);
		
		foodBtn.setBounds(340, 124, 83, 25);
		
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
				int selected = categoryDropDown.getSelectedIndex();
				
				itemDropDown.enable(true);
				
				updateDropDown(selected);				
				updateFoodInfo(selected);
				updateItemImage();
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
		
		backBtnFoods.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mainPanel.setVisible(true);
				foodPanel.setVisible(false);
			}
		});
	}
	
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
	
	private void setupComboBox()
	{
		DefaultComboBoxModel foodModel = new DefaultComboBoxModel(appController.convertFood());
		categoryDropDown.setModel(foodModel);
		
		DefaultComboBoxModel itemModel = new DefaultComboBoxModel(appController.convertBakedGoods());
		itemDropDown.setModel(itemModel);
	}
	
	//Helper Methods
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
	
	private void setupMainMenuPanel()
	{
		this.add(mainPanel, "name_364289695107993");
		mainPanel.setLayout(null);
		mainPanel.add(foodBtn);
		mainPanel.add(titleForMenu);
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
