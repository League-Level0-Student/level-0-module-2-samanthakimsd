import javax.swing.JOptionPane;

public class rollerCoaster {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Height?");
		int height = Integer.parseInt(num);
		if (height > 48) {

			JOptionPane.showInputDialog("Yay you can ride the roller coaster!");
		} else {

			JOptionPane.showMessageDialog(null, "oof you need to grow more");
		}
	}
}
