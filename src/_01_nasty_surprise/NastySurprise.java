package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	static JPanel panel = new JPanel();
	static JFrame frame = new JFrame();
	
	 JButton trick;
	 JButton treat;
	
	public void run() {
	
	 trick = new JButton("Trick");
	 treat = new JButton("Treat");
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(treat);
	panel.add(trick);
	frame.pack();
	
	trick.addActionListener(this);
	treat.addActionListener(this);
	
}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		JButton buttonPressed = (JButton) arg0.getSource();

		if(buttonPressed == treat) {
			String ScaryPuppyURL = ("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/f833c8b1-2900-4c85-b48e-5c7c02f60485/d1fjz11-60c55e5f-04d6-4331-ae5d-4cd4f7f1caab.jpg/v1/fill/w_600,h_404,q_75,strp/scary_puppy_by_newxyage_d1fjz11-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDA0IiwicGF0aCI6IlwvZlwvZjgzM2M4YjEtMjkwMC00Yzg1LWI0OGUtNWM3YzAyZjYwNDg1XC9kMWZqejExLTYwYzU1ZTVmLTA0ZDYtNDMzMS1hZTVkLTRjZDRmN2YxY2FhYi5qcGciLCJ3aWR0aCI6Ijw9NjAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.vll9wxdihxu_kXFCmDwJx-rSq-cBz0ilxbi7Gitv9cc");
			showPictureFromTheInternet(ScaryPuppyURL);
		}
		if (buttonPressed == trick) {
			String PuppyImageURL = ("https://cdn.royalcanin-weshare-online.io/pCJJPmYBaxEApS7LeAbn/v1/ed7h-how-to-buy-a-puppy-hero-dog");
			showPictureFromTheInternet(PuppyImageURL);
		}

		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	
}
