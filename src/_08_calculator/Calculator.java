package _08_calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel result = new JPanel();
	JPanel imput = new JPanel();
	JLabel label = new JLabel();
	
	JTextField var1 = new JTextField(10);
	JTextField var2 = new JTextField(10);
	JButton add = new JButton("+");
	JButton subtract = new JButton("-");
	JButton multiply = new JButton("x");
	JButton divide = new JButton("/");

	int results;
	int varA;
	int varB;
	
	public void run() {
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(3, 1);
		
		frame.setLayout(layout);

		
		panel.add(subtract);
		panel.add(add);
		panel.add(multiply);
		panel.add(divide);
		
		result.add(label);
		label.setName("");
		
		imput.add(var1);
		imput.add(var2);
		
		frame.add(imput);
		frame.add(panel);
		frame.add(result);
		frame.pack();
		
}
}
