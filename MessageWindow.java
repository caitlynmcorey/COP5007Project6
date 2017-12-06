import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.BorderLayout;

public class MessageWindow extends JFrame {
	
	private static final int HEIGHT = 150;
	private static final int WIDTH = 350;
	
	
	public MessageWindow() {
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Message");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
	//*****Panels******
		//Main Panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,1));
		
		//Footer Panel
		JPanel footerPanel = new JPanel();
		footerPanel.setLayout(new FlowLayout());
		
		//Picture Panel
		JPanel iPanel = new JPanel();
		iPanel.setLayout(new GridLayout(2,3));
		
		
	//*******Creating and adding content to each panel*****
		
		//Creating Main Panel Content
		JLabel headerLabel1 = new JLabel("Subtotal: ");
		JLabel headerLabel2 = new JLabel("Tax: ");
		JLabel headerLabel3 = new JLabel("Total: ");
		mainPanel.add(headerLabel1);
		mainPanel.add(headerLabel2);
		mainPanel.add(headerLabel3);
		
		
		//Creating OK button panel content
		JButton oKButton = new JButton("OK");
		//add Listener
		oKButton.addActionListener(new exitActionListener());
		footerPanel.add(oKButton);
		
		
		
		//Creating Picture Panel Content
		ImageIcon image = new ImageIcon("imageSmall.png");
		ImageIcon blankImage = new ImageIcon("blankImage.png");
		ImageIcon blankImage2 = new ImageIcon("blankImage.png");
		ImageIcon blankImage3 = new ImageIcon("blankImage.png");
		ImageIcon blankImage4 = new ImageIcon("blankImage.png");
		JLabel iconLabel = new JLabel(image);
		JLabel blankLabel = new JLabel(blankImage);
		JLabel blankLabel2 = new JLabel(blankImage2);
		JLabel blankLabel3 = new JLabel(blankImage3);
		JLabel blankLabel4 = new JLabel(blankImage3);
		iPanel.add(blankLabel3);
		iPanel.add(iconLabel);
		iPanel.add(blankLabel);
		iPanel.add(blankLabel2);
		iPanel.add(blankLabel4);
		
		
		
		setVisible(true);
		
		
		
//Borders
		TitledBorder breadBorder;
		breadBorder = BorderFactory.createTitledBorder("Bread");
		
		
		
	//*****add each panel to the JFrame's BorderLayout*****
		add(mainPanel, BorderLayout.CENTER);
		add(footerPanel, BorderLayout.SOUTH);
		add(iPanel, BorderLayout.WEST);
	}
	

	
	
	
	
	
	
}