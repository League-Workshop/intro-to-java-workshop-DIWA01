package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		for (int i = 0; i < 3; i++) {
			speak("spell mandlebrot");
			String word = JOptionPane.showInputDialog("spell the word");
			// 2. Catch the user's answer in a String

			// 3. If the user spelled the word correctly, speak "correct"
			if (word.equals("mandlebrot")) {
				speak("correct");
				break;
			} else {
				speak("try again");
			}
		}
		// 4. Otherwise say "wrong"
		for (int i = 0; i < 3; i++) {
			speak("spell cemetery");
			String word = JOptionPane.showInputDialog("spell the word");
			// 2. Catch the user's answer in a String

			// 3. If the user spelled the word correctly, speak "correct"
			if (word.equals("cemetery")) {
				speak("correct");
				break;
			} else {
				speak("try again");
			}
		}
		// 5. repeat the process for other words
		for (int i = 0; i < 3; i++) {
			speak("spell special");
			String word = JOptionPane.showInputDialog("spell the word");
			// 2. Catch the user's answer in a String

			// 3. If the user spelled the word correctly, speak "correct"
			if (word.equals("special")) {
				speak("correct");
				break;
			} else {
				speak("try again");
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
