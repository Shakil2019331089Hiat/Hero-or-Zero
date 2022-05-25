import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class pain_ending extends JFrame {
	ImageIcon logo; 
	
	Image bg = new ImageIcon("painback.png").getImage();
	Image giants = new ImageIcon("gia.png").getImage();
	Image loser = new ImageIcon("lost.png").getImage();
	Image grave = new ImageIcon("grave.png").getImage();
	Image stone = new ImageIcon("zackdead.png").getImage();
	
	
	private Toolkit t;
	private Dimension d;
	
	pain_ending(){
		
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
		g2D.drawImage(giants, -30, 200, null);
		g2D.drawImage(loser, 400, -20, null);
		g2D.drawImage(grave, 900, 400, null);
		g2D.drawImage(stone, 1020, 505, null);
		
		
		
		
		
		
		
	}
}











