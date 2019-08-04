package Jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontClass {

	public static void main(String[] args) {
		//for creating window object
		JFrame frame=new JFrame();
		//displaying actual window
		frame.setVisible(true);
		//for closing window/program
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the boundary for window
		frame.setBounds(70, 50, 500, 200);
		
		Container c=frame.getContentPane();
		//c.setBackground(Color.GRAY);
		c.setLayout(null);

		//lable
		JLabel lable=new JLabel();
		lable.setText("pass");
		lable.setBackground(Color.MAGENTA);
		lable.setBounds(100, 50, 100, 30);
		c.add(lable);
		//font for lable
		Font f=new Font("Arial", Font.BOLD, 30);
		lable.setFont(f);

		// set image in jlable /window 
//		ImageIcon icon=new ImageIcon("I:\\swing.jpg");
//		JLabel j2=new JLabel(icon);
//		j2.setBounds(100, 50, icon.getIconWidth(), icon.getIconHeight());
//		c.add(j2);
	
		
	
	}

}
