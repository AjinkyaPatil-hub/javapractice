package Jframe;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFeildDemo {

	public static void main(String[] args) {

		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(70, 50, 500, 200);
		frame.setTitle("TitleDemo");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		//text feild 
		JTextField myText=new JTextField();
		myText.setBounds(10, 20, 100, 80);
		//to change font
		Font f=new Font("Arial", Font.BOLD, 25);
		myText.setFont(f);

		//jpassword feild
				c.add(myText);
		
	}

}
