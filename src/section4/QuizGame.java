package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "this is a quiz");
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("what is 1+1");
		if (input.equals("2")) {
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 4.  if the user's answer was correct, add one to their score 
		String input2 = JOptionPane.showInputDialog("what is 2+2");
		if (input2.equals("4")) {
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		String input3 = JOptionPane.showInputDialog("what is 4+4");
		if (input3.equals("8")) {
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		JOptionPane.showMessageDialog(null, "your final score is " + score);
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
