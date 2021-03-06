import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.BorderFactory; 
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.AbstractButton;

public class CrustPanel extends JPanel {
	private ArrayList<AbstractButton> buttonArray;
	
	public CrustPanel(){
		super();
		buttonArray = new ArrayList<AbstractButton>();
		//Crust Panel and Border
		setLayout(new GridLayout(2,1));
		setBorder(BorderFactory.createTitledBorder("Crust"));
		//Crust Panel Content
		buttonArray.add(new JRadioButton("Deep Dish"));
		buttonArray.add(new JRadioButton("Thin Crust"));
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