import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
for (int i = 0; i < 4 ;i++) {
	

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int m = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(m);
		// 3. Use the randomNumber to give the user a random compliment.
		if(m==0) {
			JOptionPane.showMessageDialog(null, "Your hair looks good.");
		}
		if(m==1) {
			JOptionPane.showMessageDialog(null, "You are good at coding");
		}
		if(m==2) {
			JOptionPane.showMessageDialog(null, "Have a nice day");
		}
		if(m==3) {
			JOptionPane.showMessageDialog(null, "coding is fun");
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
	}
}
