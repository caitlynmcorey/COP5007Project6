import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import javax.swing.AbstractButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderCalculator extends JFrame {
	
	private static final int HEIGHT = 200;
	private static final int WIDTH = 350;
	private static final double TAX_RATE = 0.08;
	private String welcome = "Welcome to Cait's Pizzeria";
	private JFrame frame;
	
	public OrderCalculator() {
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Order Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		frame = this.frame;
		
		//Create the menu items and prices
		MenuItem deepDish = new MenuItem("Deepdish", 12.99);
		MenuItem thinCrust = new MenuItem("Thin", 9.99);
		MenuItem cheese = new MenuItem("Extra Cheese", 0.50);
		MenuItem pepperoni = new MenuItem("Pepperoni", 2.25);
		MenuItem sausage = new MenuItem("Sausage", 2.10);
		MenuItem bacon = new MenuItem("Bacon", 1.75);
		MenuItem none = new MenuItem("None", 0.0);
		MenuItem regularCoffee = new MenuItem("Regular Coffee", 0.75);
		MenuItem decafCoffee = new MenuItem("Decaf Coffee", 0.75);
		MenuItem cappuccino = new MenuItem("Cappuccino", 3.75);
		MenuItem[] items = new MenuItem[]{deepDish, thinCrust, cheese, pepperoni, sausage, 
								bacon, none, regularCoffee, decafCoffee, cappuccino};
		
	//*****Panels and Borders******
		//Bread Panel and Border
		JPanel breadPanel = new JPanel();
		breadPanel.setLayout(new GridLayout(2,1));
		breadPanel.setBorder(BorderFactory.createTitledBorder("Crust"));
		
		//Meat/Cheese Panel and Border
		JPanel meatPanel = new JPanel();
		meatPanel.setLayout(new GridLayout(4,1));
		meatPanel.setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		//Coffee Panel and Border
		JPanel coffeePanel = new JPanel();
		coffeePanel.setLayout(new GridLayout(4,1));
		coffeePanel.setBorder(BorderFactory.createTitledBorder("Other"));
		
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
		JRadioButton deepDishRadioButton = new JRadioButton("Deep Dish");
		JRadioButton thinCrustRadioButton = new JRadioButton("Thin Crust");
		//Create button group and add each button to that group
		ButtonGroup crustRadioButtonGroup = new ButtonGroup();
		crustRadioButtonGroup.add(deepDishRadioButton);
		crustRadioButtonGroup.add(thinCrustRadioButton);
		//add to panel
		breadPanel.add(deepDishRadioButton);
		breadPanel.add(thinCrustRadioButton);
		
		
		//Meat/Cheese Panel Content 
		JCheckBox cheeseCheckBox = new JCheckBox("Extra Cheese");
		JCheckBox pepperoniCheckBox = new JCheckBox("Pepperoni");
		JCheckBox sausageCheckBox = new JCheckBox("Sausage");
		JCheckBox baconCheckBox = new JCheckBox("Bacon");
		//add to panel
		meatPanel.add(cheeseCheckBox);
		meatPanel.add(pepperoniCheckBox);
		meatPanel.add(sausageCheckBox);
		meatPanel.add(baconCheckBox);
		
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
		//add to panel
		coffeePanel.add(coffeeRadioNone);
		coffeePanel.add(coffeeRadioRegular);
		coffeePanel.add(coffeeRadioDecaf);
		coffeePanel.add(coffeeRadioCappuccino);
		//add all menu buttons to array
		AbstractButton[] menuButtonArray = new AbstractButton[]{deepDishRadioButton, thinCrustRadioButton, 
											cheeseCheckBox, pepperoniCheckBox, sausageCheckBox, 
											baconCheckBox, coffeeRadioNone, coffeeRadioRegular, 
											coffeeRadioDecaf, coffeeRadioCappuccino};
		//Footer Panel Content
		JButton calculateButton = new JButton("Calculate");
		JButton exitButton = new JButton("Exit");
		
		//add Listener
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double subtotal = 0;
				double tax = 0;
				double total = 0;
				for(int i = 0; i < items.length; i++){
					if (menuButtonArray[i].isSelected()) {
						subtotal += items[i].getPrice();
					}
				}
				tax = subtotal * TAX_RATE;
				total = subtotal + tax;
				JOptionPane.showMessageDialog(frame, String.format("%s%.2f\n%s%.2f\n%s%.2f", 
																	"Subtotal: $", subtotal, 
																	"Tax: $", tax, "Total: $", total), 
																	"Message", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
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