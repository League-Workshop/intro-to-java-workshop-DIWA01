package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer1 = JOptionPane.showInputDialog("What is the tallest building in the world");
		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer is correct
		if (answer1.equalsIgnoreCase("Burj Khalifa")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
			score--;
		}
		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String answer2 = JOptionPane.showInputDialog("what is the smallest town in the world");
		if (answer2.equalsIgnoreCase("Buford")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
			score--;
		}

		String answer3 = JOptionPane.showInputDialog("what is the smallest dog in the world");
		if (answer3.equalsIgnoreCase("Teacup Poodles")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
			score--;
		}

		String answer4 = JOptionPane.showInputDialog("who is the fastest person in the world");
		if (answer4.equals("Usain Bolt")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
			score--;
		}

		// 6. After all the questions have been asked, print the user's score
JOptionPane.showMessageDialog(null, "your score is" + score);
}
}
