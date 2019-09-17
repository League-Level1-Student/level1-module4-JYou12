package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
			
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random random = new Random();
		int rand = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(rand);
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask a yer or no question");
	// 5. If the random number is 0
		if(rand== 0) {
		JOptionPane.showMessageDialog(null, "Yes");
		}else if(rand== 0) {
			JOptionPane.showMessageDialog(null, "No");
			}else if(rand== 1) {
			JOptionPane.showMessageDialog(null, "May you should ask google?");
			}else if(rand== 2) {
			JOptionPane.showMessageDialog(null, "Yes");
			}else if(rand == 3) {
				JOptionPane.showMessageDialog(null, "Definently not!");
			}
	}
}
