import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.BorderFactory; 
import java.awt.BorderLayout;

public class CrustPanel extends JPanel {
	private JRadioButton deepDishRadioButton;
	private JRadioButton thinCrustRadioButton;
	public CrustPanel(){
		super();
		//Crust Panel and Border
		JPanel crustPanel = new JPanel();
		setLayout(new GridLayout(2,1));
		setBorder(BorderFactory.createTitledBorder("Crust"));
		//Crust Panel Content
		deepDishRadioButton = new JRadioButton("Deep Dish");
		thinCrustRadioButton = new JRadioButton("Thin Crust");
		//Create button group and add each button to that group
		ButtonGroup crustRadioButtonGroup = new ButtonGroup();
		crustRadioButtonGroup.add(deepDishRadioButton);
		crustRadioButtonGroup.add(thinCrustRadioButton);
		//add to panel
		add(deepDishRadioButton);
		add(thinCrustRadioButton);
		setVisible(true);
	}
	
	public JRadioButton getButton(int i){
		JRadioButton[] buttonArray = new JRadioButton[] {deepDishRadioButton, thinCrustRadioButton};
		return buttonArray[i];
	}
}