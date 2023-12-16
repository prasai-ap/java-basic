
package Swings;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
public class Swing implements ActionListener{
	JTextField textUser;
	JPasswordField textPass;
	JFrame f;
	HashMap<String, String> credentials=new HashMap<>();
	
	LinkedList<String> cred=null;
	
	public Swing(){
		cred = new LinkedList<>();
		//1. creating container
		f = new JFrame("Library Management System");
		f.setSize(400,400);
		//f.setTitle("Library Management System"); 
	
		
		JLabel labelUser = new JLabel("User Name : ");
		labelUser.setBounds(30,40,150,40); 
		
		JLabel labelPass = new JLabel("Password : ");
		labelPass.setBounds(30,100,50,40); 
		
		textUser = new JTextField(); 
		textUser.setBounds(180,40,170,40); 
		
		textPass = new JPasswordField(); 
		textPass.setBounds(180,100,170,40); 
		
		JButton btnRegister = new JButton();  
		btnRegister.setText("Register"); 
		btnRegister.setBounds(20,150,170,40);
		
		btnRegister.addActionListener(this);
		
		JButton btn = new JButton("submit");  
		//btn.setText("submit"); 
		btn.setBounds(200,150,170,40);
		
		btn.addActionListener(this); 
		  
		
		f.getContentPane().add(btn);  
		f.getContentPane().add(textUser);  
		f.getContentPane().add(labelUser); 
		f.getContentPane().add(labelPass);
		f.getContentPane().add(textPass);
		f.getContentPane().add(btnRegister);
	
			
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Register") {
			String uname = textUser.getText().toString();
			String pass = textPass.getText().toString();
			cred.add(uname);
			cred.add(pass);
			JOptionPane.showMessageDialog(null,"Registered Succesfully","System Administrator",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getActionCommand()=="submit"){
			String u = textUser.getText().toString();
			String p = textPass.getText().toString();
			if(u.equals(cred.get(0)) && p.equals(cred.get(1))) {
			Dashboard db = new Dashboard();

			}
		}
		else {
				 JOptionPane.showMessageDialog(null,"Invalid Username or password","Error",JOptionPane.WARNING_MESSAGE);
		}
	}
	
				
}

