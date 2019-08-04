package Jframe;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstFrame {
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(700, 500);
//		frame.setLocation(100, 50);
		frame.setBounds(70, 50, 500, 200);
		frame.setTitle("TitleDemo");
		ImageIcon im=new ImageIcon("I:\\swing.jpg");
		frame.setIconImage(im.getImage());
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		JLabel lable=new JLabel("User_Name");
		lable.setBounds(100, 50, 100, 30);
		c.add(lable);
		
		
	}
}
