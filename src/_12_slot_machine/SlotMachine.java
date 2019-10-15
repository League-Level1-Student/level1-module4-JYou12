package _12_slot_machine;

import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	
	JFrame frame = new JFrame();
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel row3 = new JPanel();
	JPanel images = new JPanel();
	JPanel spinButton = new JPanel();

	JLabel cherry = new JLabel();
	JLabel grape = new JLabel();
	JLabel orange = new JLabel();
	
	JButton spin = new JButton();
	
	Random rand = new Random();
	GridLayout layout = new GridLayout(2, 1);

 void run() throws MalformedURLException {
	
	 	cherry = createLabelImage("cherry.jpeg");
	 	grape = createLabelImage("grapes.jpeg");
	 	orange = createLabelImage("orange.png");
	 	 	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(layout);
		
		spin.setSize(50,50);
		spin.setText("SPIN");
		
		
		spinMachine(row1);
		spinMachine(row2);
		spinMachine(row3);
		
		spinButton.add(spin);
		
		frame.add(images);
		frame.add(spinButton);

	 
		frame.pack();
 }

 private JLabel createLabelImage(String fileName) throws MalformedURLException{
     URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
 
 void spinMachine(JPanel row) {
	 int image = rand.nextInt(3);
	 if(image == 1) {
			row.add(cherry);

	 } else if(image == 2) {
			row.add(orange);

	 } else if(image == 3) {
			row.add(grape);

	 } 
	 
 }
 
}
