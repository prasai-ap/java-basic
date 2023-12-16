package random;
import javax.swing.*; 
import java.awt.event.*;
import java.io.*;
public class Wel implements ActionListener {
	JTextField textname;
	JPasswordField textpass;
	JFrame jf;
	public Wel(){
	jf=new JFrame("Login Form");
	jf.setSize(600,400);
	JLabel labelUser=new JLabel("User Name:");
	labelUser.setBounds(30,40,150,40); 
	JLabel labelPass=new JLabel("Password:");
	labelPass.setBounds(30,100,150,40); 
	textname=new JTextField(); 
	textname.setBounds(180,40,170,40); 
	textpass=new JPasswordField(); 
	textpass.setBounds(180,100,170,40);
	JButton js=new JButton("Submit");
	JButton jr=new JButton("Register");
	JButton jc=new JButton("Close");
	js.addActionListener(this);
	jr.addActionListener(this);
	jc.addActionListener(this);
	js.setBounds(30, 300,150,40);
	jr.setBounds(192,300,200,40);
	jc.setBounds(400,300,150,40);
	jf.getContentPane().add(js);  
	jf.getContentPane().add(textname);  
	jf.getContentPane().add(labelUser); 
	jf.getContentPane().add(labelPass);
	jf.getContentPane().add(textpass);
	jf.getContentPane().add(jr);
	jf.getContentPane().add(jc);
	jf.setLayout(null);
	jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String uname=textname.getText().toString();
		String pass=textpass.getText().toString();
		if(e.getActionCommand()=="Register") {
			//String un,p;
			try {
				FileWriter fw = new FileWriter("D://login.txt");
				fw.write(uname+"\t"+pass+"\n");
				fw.flush();
				fw.close();
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}	
		}
		else if(e.getActionCommand()=="Submit") {
			String un,p;
			String line = null;
			try {
				FileReader fr=new FileReader("D://login.txt");
				BufferedReader reader = new BufferedReader(fr);
				line =reader.readLine();
				boolean b=false;
				while(line!=null) {
					String credintials[] = line.split("\t");
					un=credintials[0];
					p=credintials[1];
					if(un.equals(uname) && p.equals(pass)) {
						b=true;
						break;					
					}					
					line =reader.readLine();
				}
				if(b==true) {
					DashBoard db = new DashBoard();
				}
				else {
					JOptionPane.showMessageDialog(null,"username and password didn't match","Status",JOptionPane.WARNING_MESSAGE);
				}
						
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}			
		}
		else {
			 JFrame frame = new JFrame();
			    String message = "message";
			    int answer = JOptionPane.showConfirmDialog(frame, message);
			    if (answer == JOptionPane.YES_OPTION) {
			      jf.dispose();
			    } 
			    else if (answer == JOptionPane.NO_OPTION) {
			    	frame.dispose();
			    }
		}
		
	}
	

}
