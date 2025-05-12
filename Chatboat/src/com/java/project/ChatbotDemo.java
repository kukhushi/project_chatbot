package com.java.project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	
	private JTextArea ca= new JTextArea() ;
	private JTextField cf=new JTextField();
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	Chatbot(){
		
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.cyan);
		f.setTitle("ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(300,310);
		ca.setLocation(1,1);
		ca.setBackground(Color.BLACK);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		l.setText("SEND");
		f.add(b);
		b.add(l);
	    b.setSize(400,20);
		b.setLocation(300,320);
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==b) {
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.BLUE);
					ca.setBackground(Color.WHITE);
					ca.append("You-->" + text +"\n");
					cf.setText("");
					
					if(text.contains("hello")) {
						replyMeth("Hello!");
					}
					else if(text.contains("how are you")) {
						replyMeth("I'm Good:)Thankyou for asking.What about you?");
						}
					else if(text.contains("what is your name")) {
						replyMeth("I'm Khushi!");
					}
					else if(text.contains("are you from delhi")) {
						replyMeth("YES,I'm from MAC Delhi,Nice talk to you! See you soon,BYE! ");
					}
					else if(text.contains("bye")) {
						replyMeth("Too soon!:(Anyways STAY HOME SYAY SAFE");
					}
					
					
					
					else
						replyMeth("I Can't Understand");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {
		ca.append("ChatBot-->"+s+"\n");
	}
	
}


public class ChatbotDemo {

	public static void main(String[] args) {
		new Chatbot();
		

	}

}
