package Jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFeild {

	public static void main(String[] args) {

		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(70, 50, 500, 200);
		frame.setTitle("TitleDemo");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		//creating button
		JButton btn=new JButton("click me");
		btn.setBounds(100, 50, 200, 40);
		//creating change the text //used in event handling
		//btn.setText("Another");
		Font f=new Font("Arial", Font.BOLD, 20);
		btn.setFont(f);
		btn.setBackground(Color.gray);
		//cursor
		Cursor cur=new Cursor(Cursor.WAIT_CURSOR);
		btn.setCursor(cur);
		c.add(btn);
		
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(500, 200, 100, 30);
		c.add(pass);
		
	}

}
