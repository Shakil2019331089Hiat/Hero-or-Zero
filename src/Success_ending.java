import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Success_ending extends JFrame {
	ImageIcon logo; 
	
	Image bg = new ImageIcon("ends.jpg").getImage();
	Image write_complete = new ImageIcon("complete (2).png").getImage();
	Image write_hero = new ImageIcon("hero1.png").getImage();
	
	private Toolkit t;
	private Dimension d;
	
	Success_ending(){
		
		logo = new ImageIcon("logo.png");
		 
		success_ending_label label = new success_ending_label();
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("HERO_OR_ZERO");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.pack();
		//this.setLocationRelativeTo(null);
		this.setIconImage(logo.getImage());
		
		this.setSize(1223, 790);
		t = getToolkit();
		d = t.getScreenSize();
		this.setLocation(d.width/2 - getWidth()/2 , d.height/2 - getHeight()/2);
		
		this.add(label);
		
		this.setVisible(true);
		
		
		
	}
	
	
	
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(bg, 0, 0, null);
		g2D.drawImage(write_complete, 10, 50, null);
		g2D.drawImage(write_hero, 500, 500, null);
		
		//g2D.drawImage(enemy, 100, 400, null);
		
		
		
		
		
		
		
		
	}
}











