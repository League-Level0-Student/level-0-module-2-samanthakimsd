import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Age?");
		int age = Integer.parseInt(num);
		if (age > 17) {

			JOptionPane.showInputDialog("Who do you want to be the next president?");
		} else {

			JOptionPane.showMessageDialog(null, "Your vote does not matter");
		}
	}
}
