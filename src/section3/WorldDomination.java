package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "nice");
		}else {
			JOptionPane.showMessageDialog(null, "oh");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

