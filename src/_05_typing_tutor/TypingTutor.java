package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label;
	char currentLetter;
	String letter;
	void run() {
		
		currentLetter = generateRandomLetter();
		letter = "" + currentLetter;
		
		label = new JLabel(letter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setVisible(true);
		frame.setName("Typing Tutor");
		
		frame.add(panel);
		panel.add(label);
		frame.pack();
		
		frame.addKeyListener(this);

	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if(currentLetter == e.getKeyChar()) {
			System.out.println("Correct");
			label.setBackground(Color.green);			
		}else {
			label.setBackground(Color.RED);
			System.out.println("Wrong");
		}		
		//currentLetter = ' ';
		currentLetter = generateRandomLetter();
		letter = "" + currentLetter;
		label.setText(letter);

		
	}
	
}
