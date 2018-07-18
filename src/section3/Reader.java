package section3;

import javax.swing.JOptionPane;

public class Reader {
	public static void main(String[] args) {
	String name=	JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"hello "+ name + "how are you?");
	}

}
