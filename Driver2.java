import javax.swing.SwingUtilities;

public class Driver2 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new OrderCalculator();
			}
		});
	}
}
