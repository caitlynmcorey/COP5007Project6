import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.BorderFactory; 
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.AbstractButton;

public class CoffeePanel extends JPanel {
	private ArrayList<AbstractButton> buttonArray;
	
	public CoffeePanel(){
		super();
		buttonArray = new ArrayList<AbstractButton>();
		//Coffee Panel and Border
		setLayout(new GridLayout(4,1));
		setBorder(BorderFactory.createTitledBorder("Coffee"));
		//Crust Panel Content
		buttonArray.add(new JRadioButton("None"));
		buttonArray.add(new JRadioButton("Regular Coffee"));
		buttonArray.add(new JRadioButton("Decaf Coffee"));
		buttonArray.add(new JRadioButton("Cappuccino"));
		//Create button group and add each button to that group
		ButtonGroup radioButtonGroup = new ButtonGroup();
		for(AbstractButton element : buttonArray) {
			radioButtonGroup.add(element);
			add(element);
		}
		setVisible(true);
	}
	
	/**
	@param i the index of the JRadioButton in the ArrayList
	@return buttonArray[i] the JRadioButton at index i
	*/
	public AbstractButton getButton(int i){
		return buttonArray.get(i);
	}
	
	/**
	@return buttonArray an ArrayList of all the buttons
	*/
	public ArrayList<AbstractButton> getAllButtons() {
		return buttonArray;
	}
}