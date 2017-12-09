/**
A GUI for Pizza Ordering

@Author: Caitlyn Corey
@version 1.0
E-mail Address: cmc75@students.uwf.edu
Last Changed: December 8, 2017

COP5007 Project #6
File Name: OrderCalculator.java
*/	

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class HeaderPanel extends JPanel {
	private String welcome;			//Welcome message
	private JLabel headerLabel;		//Display area for the welcome message
	
	/**
	Default constructor. Creates a HeaderPanel object to display a welcome message.
	*/
	public HeaderPanel(){
		super();
		setTitle("Welcome to Cait's Pizzeria");
		headerLabel = new JLabel(getTitle());
		add(headerLabel);
		setVisible(true);
	}
	
	/**
	Mutator message to set the title which is the welcome message.
	@param title the welcome message
	*/
	public void setTitle(String title) {
		welcome = title;
	}
	
	/**
	@return welcome the welcome message
	*/
	public String getTitle() {
		return welcome;
	}
}