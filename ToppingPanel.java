import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BorderFactory; 
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ToppingPanel extends JPanel {
	private ArrayList<AbstractButton> buttonArray;

	public ToppingPanel(){
		super();
		buttonArray = new ArrayList<AbstractButton>();
		//Meat/Cheese Panel and Border
		setLayout(new GridLayout(4,1));
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		//Meat/Cheese Panel Content 
		buttonArray.add(new JCheckBox("Extra Cheese"));
		buttonArray.add(new JCheckBox("Pepperoni"));
		buttonArray.add(new JCheckBox("Sausage"));
		buttonArray.add(new JCheckBox("Bacon"));
		//add to panel
		for(AbstractButton element : buttonArray) {
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