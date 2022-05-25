import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
//import java.awt.*;
//import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Mainpanel extends JPanel implements ActionListener{
	//private static final long serialVersionUID = 1L;
	Image bg = new ImageIcon("front 4.jpeg").getImage();
	Image hero = new ImageIcon("prince.png").getImage();
	Image enemy = new ImageIcon("enemy.png").getImage();
	//Image enemy2 = new ImageIcon("enemy 2.png").getImage();
	JButton start;
	ImageIcon start_icon;
	
	JButton option;
	ImageIcon option_icon;
	 
	JButton about;
	ImageIcon about_icon;
	
	JButton exit;
	ImageIcon exit_icon;
	
	JButton help;
	ImageIcon help_icon;
	
	
	Mainpanel(){
		
				
		start = new JButton("START");
		start.setBounds(500, 100, 200, 50);
		start.setFocusable(false);
		start.setToolTipText("Start your journy");
		start.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		
		start_icon = new ImageIcon("start_icon.png");
		start.setIcon(start_icon);
		
		start.setIconTextGap(-10);
		start.setVerticalTextPosition(SwingConstants.CENTER);
		start.setHorizontalTextPosition(SwingConstants.RIGHT);
		
		
		
		option = new JButton("OPTION");
		option.setBounds(500, 175, 200, 50);	
		option.setFocusable(false);
		option.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		option_icon = new ImageIcon("option.png");
		option.setIcon(option_icon);
		
		  
		 
		about = new JButton("ABOUT");
		about.setBounds(500, 250, 200, 50);	
		about.setFocusable(false); 
		about.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		about_icon = new ImageIcon("about.png");
		about.setIcon(about_icon);
		about.setIconTextGap(10);
		
		
		
		exit = new JButton("EXIT");
		exit.setBounds(500, 325, 200, 50);	
		exit.setFocusable(false);
		exit.setToolTipText("Quite Game");
		exit.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		exit_icon = new ImageIcon("exit.png");
		exit.setIcon(exit_icon);
		exit.setIconTextGap(10);
		exit.setVerticalTextPosition(SwingConstants.CENTER);
		exit.setHorizontalTextPosition(SwingConstants.RIGHT);
		exit.addActionListener(this);
		
		
		
		help = new JButton(); 
		help.setBounds(1160, 0, 40, 40);
		help.setFocusable(false);
		help_icon = new ImageIcon("help.png");
		help.setIcon(help_icon);
		help.setToolTipText("Help");
		//help.addActionListener(this);
		
		
		
		
		this.setPreferredSize(new Dimension(1200, 750));
		this.setLayout(null);
		this.add(start);
		this.add(option);
		this.add(about);
		this.add(exit);
		this.add(help);
		//this.add(name);
	}
	
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(bg, 0, 0, null);
		g2D.drawImage(hero, 700, 400, null);
		//g2D.drawImage(enemy2, -300, 430, null);
		g2D.drawImage(enemy, 100, 400, null);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
	

}
