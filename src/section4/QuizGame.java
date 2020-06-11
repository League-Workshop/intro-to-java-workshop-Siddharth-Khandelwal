package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is 3+3-6+2? ");
		// 3.  Use an if statement to check if their answer is correct
		if (input.equals("2")) {
			score+=1;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String input2 = JOptionPane.showInputDialog("What is 7+2-6+3x4?");
		if (input2.contentEquals("15")) {
			score+=1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You got " +score+" out of 2 correct");
	}
}
