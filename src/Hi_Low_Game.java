import javax.swing.JOptionPane;

import java.util.Random;

public class Hi_Low_Game {
	
	public static void main(String[] args) {
		
		int numero;
		numero = new Random().nextInt(100);
		String input = JOptionPane.showInputDialog("guess the number that the computer chose. (its between 1 & 100");
		int num = Integer.parseInt(input);
		if (num < numero) {
			input = JOptionPane.showInputDialog("guess the number that the computer chose. (its between 1 & 100");
		}
	}
}
