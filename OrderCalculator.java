import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.BorderLayout;
import java.awt.Color;

public class OrderCalculator extends JFrame {
	
	private static final int HEIGHT = 200;
	private static final int WIDTH = 350;
	
	private String wheatString = "Wheat";
	private String whiteString = "White";
	private String welcome = "Welcome to Johnny's Sandwich Shop";
	
	
	public OrderCalculator() {
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Order Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
	//*****Panels and Borders******
		//Bread Panel and Border
		JPanel breadPanel = new JPanel();
		breadPanel.setLayout(new GridLayout(2,1));
		TitledBorder breadTitledBorder;
		breadTitledBorder = BorderFactory.createTitledBorder("Bread");
		breadTitledBorder.setTitleJustification(TitledBorder.LEFT);
		breadPanel.setBorder(breadTitledBorder);
		
		//Meat/Cheese Panel and Border
		JPanel meatPanel = new JPanel();
		meatPanel.setLayout(new GridLayout(4,1));
		TitledBorder meatTitledBorder;
		meatTitledBorder = BorderFactory.createTitledBorder("Meat/Cheese");
		meatTitledBorder.setTitleJustification(TitledBorder.LEFT);
		meatPanel.setBorder(meatTitledBorder);
		
		//Coffee Panel and Border
		JPanel coffeePanel = new JPanel();
		coffeePanel.setLayout(new GridLayout(4,1));
		TitledBorder coffeeTitledBorder;
		coffeeTitledBorder = BorderFactory.createTitledBorder("Coffee");
		coffeeTitledBorder.setTitleJustification(TitledBorder.LEFT);
		coffeePanel.setBorder(meatTitledBorder);
		
		//Footer Panel
		JPanel footerPanel = new JPanel();
		footerPanel.setLayout(new FlowLayout());
		
		//Header Panel
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new FlowLayout());
		
		
	//*******Creating and adding content to each panel*****
		//Creating Header Panel Content
		JLabel headerLabel = new JLabel(welcome);
		headerPanel.add(headerLabel);
		
		//Bread Panel Content
		JRadioButton wheatBreadRadioButton = new JRadioButton(wheatString);
		JRadioButton whiteBreadRadioButton = new JRadioButton(whiteString);
		//Create button group and add each button to that group
		ButtonGroup breadRadioButtonGroup = new ButtonGroup();
		breadRadioButtonGroup.add(wheatBreadRadioButton);
		breadRadioButtonGroup.add(whiteBreadRadioButton);
		//add each button to the panel
		breadPanel.add(wheatBreadRadioButton);
		breadPanel.add(whiteBreadRadioButton);
		
		
		//Meat/Cheese Panel Content 
		JCheckBox cheeseCheckBox = new JCheckBox("Cheese");
		JCheckBox roastBeefCheckBox = new JCheckBox("Roast Beef");
		JCheckBox turkeyCheckBox = new JCheckBox("Turkey");
		JCheckBox hamCheckBox = new JCheckBox("Ham");
		//add to panel
		meatPanel.add(cheeseCheckBox);
		meatPanel.add(roastBeefCheckBox);
		meatPanel.add(turkeyCheckBox);
		meatPanel.add(hamCheckBox);
		
		//Coffee Panel Content
		JRadioButton coffeeRadioNone = new JRadioButton("None");
		JRadioButton coffeeRadioRegular = new JRadioButton("Regular coffee");
		JRadioButton coffeeRadioDecaf = new JRadioButton("Decaf coffee");
		JRadioButton coffeeRadioCappuccino = new JRadioButton("Cappuccino");
		//Create button group and add each button to that group
		ButtonGroup coffeeRadioButtonGroup = new ButtonGroup();
		coffeeRadioButtonGroup.add(coffeeRadioNone);
		coffeeRadioButtonGroup.add(coffeeRadioRegular);
		coffeeRadioButtonGroup.add(coffeeRadioDecaf);
		coffeeRadioButtonGroup.add(coffeeRadioCappuccino);
		//add each button to the panel
		coffeePanel.add(coffeeRadioNone);
		coffeePanel.add(coffeeRadioRegular);
		coffeePanel.add(coffeeRadioDecaf);
		coffeePanel.add(coffeeRadioCappuccino);
		
		//Footer Panel Content
		JButton calculateButton = new JButton("Calculate");
		JButton exitButton = new JButton("Exit");
		//add Listener
		calculateButton.addActionListener(new calculateActionListener());
		exitButton.addActionListener(new exitActionListener());
		//add each button to the panel
		footerPanel.add(calculateButton);
		footerPanel.add(exitButton);

		
		setVisible(true);
		
		
	//*****add each panel to the JFrame's BorderLayout*****
		add(breadPanel, BorderLayout.WEST);
		add(footerPanel, BorderLayout.SOUTH);
		add(meatPanel, BorderLayout.CENTER);
		add(coffeePanel, BorderLayout.EAST);
		add(headerPanel, BorderLayout.NORTH);
	}
	
	
	
	
	
	
	
	
}