package _12_slot_machine;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel row3 = new JPanel();
	JPanel images = new JPanel();
	JPanel spinButton = new JPanel();

	//JLabel cherry = new JLabel();
	//JLabel grape = new JLabel();
	//JLabel orange = new JLabel();
	
	JButton spin = new JButton();
	
	Random rand = new Random();
	GridLayout layout = new GridLayout(2, 1);
	String win = "";
	
 void run() throws MalformedURLException {
	
	 	//cherry = createLabelImage("cherry.jpeg");
	 	//grape = createLabelImage("grapes.jpeg");
	 	//orange = createLabelImage("orange.png");
	 	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(layout);
		
		spin.setText("SPIN");
		
		slotMachine();
		
		
		spinButton.add(spin);
		
		frame.add(images);
		frame.add(spin);

		spin.addActionListener(this);;
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
 
 void spinMachine(JPanel row) throws MalformedURLException {
	 int image = rand.nextInt(3);
	 row.removeAll();
	 
	 if(image == 1) {
			JLabel cherry = new JLabel();
			cherry = createLabelImage("cherry.jpeg");
			row.add(cherry);
	 } else if(image == 2) {
			JLabel orange = new JLabel();
			orange = createLabelImage("orange.png");
			row.add(orange);
	 } else if(image == 0) {
			JLabel grape = new JLabel();
			grape = createLabelImage("grapes.jpeg");
			row.add(grape);
	 } 
	 win += " " + image;
	 System.out.println(win);
	 if(win.equalsIgnoreCase(" 0 0 0")) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}else if(win.equalsIgnoreCase(" 1 1 1")) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}else if(win.equalsIgnoreCase(" 2 2 2")) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}else if(win.equalsIgnoreCase(" 3 3 3")) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		
 }
 
 void slotMachine() throws MalformedURLException {
	 	
	 	images.remove(row1);
	 	images.remove(row2);
	 	images.remove(row3);
	 	frame.pack();
	 	
		spinMachine(row1);
		images.add(row1);
		spinMachine(row2);
		images.add(row2);
		spinMachine(row3);
		images.add(row3);
		win = "";
 }

@Override
public void actionPerformed(ActionEvent arg0) {

	try {
		slotMachine();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	frame.pack();
}
 
}
