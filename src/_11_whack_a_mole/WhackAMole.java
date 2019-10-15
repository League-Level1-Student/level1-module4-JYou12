package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel row3 = new JPanel();
	JPanel row4 = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	JButton b0 = new JButton();

	int buttonNumber = 11;
	int buttonN;
	int MolesWhacked = 0;
	
	GridLayout layout = new GridLayout(4, 3);
	Random rand = new Random();
int button;

	void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(layout);
		
		row1.add(b1);
		row1.add(b2);
		row1.add(b3);

		row2.add(b4);
		row2.add(b5);
		row2.add(b6);

		row3.add(b7);
		row3.add(b8);
		row3.add(b9);

		row4.add(b10);
		row4.add(b11);
		row4.add(b0);
		
		frame.add(row1);
		frame.add(row2);
		frame.add(row3);
		frame.add(row4);

		frame.pack();
		
		getRandomButton();
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b9.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		
		
	}
	
	void getRandomButton() {

		button = rand.nextInt(11);
		
		if(button == 0) {
			b1.setText("Mole!");
			buttonN = 1;
		}else if(button == 1) {
			b2.setText("Mole!");
			buttonN = 2;
		}else if(button == 2) {
			buttonN = 3;
			b3.setText("Mole!");
		}else if(button == 3) {
			b4.setText("Mole!");
			buttonN = 4;
		}else if(button == 4) {
			b5.setText("Mole!");
			buttonN = 5;
		}else if(button == 5) {
			b6.setText("Mole!");
			buttonN =6;
		}else if(button == 6) {
			b7.setText("Mole!");
			buttonN =7;
		}else if(button == 7) {
			b8.setText("Mole!");
			buttonN =8;
		}else if(button == 8) {
			b9.setText("Mole!");
			buttonN =9;
		}else if(button == 9) {
			b10.setText("Mole!");
			buttonN =10;
		}else if(button == 10) {
			b11.setText("Mole!");
			buttonN =11;
		}else if(button == 11) {
			b0.setText("Mole!");
			buttonN =12;
		}

		System.out.println(buttonN + " ");
		
	}
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if(buttonN == 1 && e.getSource() == b1) {
			hit();
		}else if(buttonN == 2 && e.getSource() == b2) {
			hit();
		}else if(buttonN == 3 && e.getSource() == b3) {
			hit();
		}else if(buttonN == 4 && e.getSource() == b4) {
			hit();
		}else if(buttonN == 5 && e.getSource() == b5) {
			hit();
		}else if(buttonN == 6 && e.getSource() == b6) {
			hit();
		}else if(buttonN == 7 && e.getSource() == b7) {
			hit();
		}else if(buttonN == 8 && e.getSource() == b8) {
			hit();
		}else if(buttonN == 9 && e.getSource() == b9) {
			hit();
		}else if(buttonN == 10 && e.getSource() == b10) {
			hit();
		}else if(buttonN == 11 && e.getSource() == b11) {
			hit();
		}else if(buttonN == 0 && e.getSource() == b0) {
			hit();
			
		}else if(!(buttonN == 2 && e.getSource() == b1)) {
			System.out.println("MISS");
		}else if(!(buttonN == 3 && e.getSource() == b2)) {
			System.out.println("MISS");
		}else if(!(buttonN == 4 && e.getSource() == b3)) {
			System.out.println("MISS");
		}else if(!(buttonN == 5 && e.getSource() == b4)) {
			System.out.println("MISS");
		}else if(!(buttonN == 6 && e.getSource() == b5)) {
			System.out.println("MISS");
		}else if(!(buttonN == 7 && e.getSource() == b6)) {
			System.out.println("MISS");
		}else if(!(buttonN == 8 && e.getSource() == b7)) {
			System.out.println("MISS");
		}else if(!(buttonN == 9 && e.getSource() == b8)) {
			System.out.println("MISS");
		}else if(!(buttonN == 10 && e.getSource() == b9)) {
			System.out.println("MISS");
		}else if(!(buttonN == 11 && e.getSource() == b10)) {
			System.out.println("MISS");
		}else if(!(buttonN == 12 && e.getSource() == b11)) {
			System.out.println("MISS");
		}else if(!(buttonN == 1 && e.getSource() == b0)) {
			System.out.println("MISS");
		}
		
		frame.remove(row1);
		frame.remove(row2);
		frame.remove(row3);
		frame.remove(row4);
		frame.pack();
		clear();
		getRandomButton();
		frame.add(row1);
		frame.add(row2);
		frame.add(row3);
		frame.add(row4);
		frame.pack();
		
	if(MolesWhacked == 10) {
		endGame(new Date(System.currentTimeMillis()), MolesWhacked);
	}

		
	}
	
	boolean didHit(int button) {
		
		if(button == this.button) {
			return true;
		}else {
			return false;
			}
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date(System.currentTimeMillis());
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	} 
	
	void hit() {
		System.out.println("HIT");
		MolesWhacked ++;
	}
	
	void clear() {
		
		b0.setText(" ");
		b1.setText(" ");
		b2.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		b10.setText(" ");
		b11.setText(" ");
		
	}
	
}
