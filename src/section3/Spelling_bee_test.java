package section3;

import javax.swing.JOptionPane;

public class Spelling_bee_test {

	public static void main(String[] args) {
		speak("spell mandlebrot");
		String input = JOptionPane.showInputDialog("input here");
		
	while(!input.equals ("mandlebrot"))	{
		if (input.equals("mandlebrot")) {
			speak("correct");
		}else {
			speak("wrong");
		}
	}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
