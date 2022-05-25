import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gameframe extends JFrame {
	ImageIcon logo; 
	
	
	Gameframe(){
		logo = new ImageIcon("logo.png");
		
		Mainpanel back = new Mainpanel(); 
		//successendpanel successend = new successendpanel();
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("HERO_OR_ZERO");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		this.add(back);
		//this.add(successend);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setIconImage(logo.getImage());
		
		this.setVisible(true);
		
		
		
	}
}
