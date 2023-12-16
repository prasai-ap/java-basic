package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Dashboard implements ActionListener {
	JTextField textFirst;
	JTextField textLast;
	JTextField textBook;
	JLabel labelFirst,labelLast,labelGender,labelProgram,labelSection,labelBook; 
	JRadioButton rbMale,rbFemale,rbOthers ;
	JComboBox comboProgram,comboSection;
	JButton btnAdd,btnDisplay;
	
	public Dashboard() {
		JFrame frame = new JFrame("Dash board");
		frame.setSize(500,400);
		JPanel panel = new JPanel();
		GridLayout gidLayout = new GridLayout(7,2);
		panel.setLayout(gidLayout);
		labelFirst = new JLabel("First name");
		labelLast = new JLabel("Last name");
		labelGender = new JLabel("Gender");
		labelProgram = new JLabel("Program");
		labelSection = new JLabel("Section");
		labelBook = new JLabel("Book Taken");
		labelFirst.setSize(200,40);
		labelLast.setSize(200,40);
		labelGender.setSize(200,40);
		labelProgram.setSize(200,40);
		labelSection.setSize(200,40);
		labelBook.setSize(200,40);
		textFirst = new JTextField();
		textLast = new JTextField();
		textFirst.setSize(200,40);
		textLast.setSize(200,40);
		JPanel genderPanel =new JPanel();
		genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		rbMale = new JRadioButton("male");
		rbFemale = new JRadioButton("female");
		rbOthers = new JRadioButton("others");
//		ButtonGroup rg = new ButtonGroup();
//		rg.add(rbMale);
//		rg.add(rbFemale);
//		rg.add(rbOthers);
		genderPanel.add(rbMale);
		genderPanel.add(rbFemale);
		genderPanel.add(rbOthers);
		String[] programs = {"BBA","BCIS","BCSIT","BBATT","BBABI"};		
		comboProgram = new JComboBox(programs);
		String[] sections = {"Hypervisor","Grit/Garnet","Fusion","Fourier","Enum","Efika","Divine","Deism","Maxthon","Mozilla"};		
		comboSection = new JComboBox(sections);
		comboProgram.setSize(200,40);
		comboSection.setSize(200,40);
		textBook = new JTextField();
		textBook.setSize(200,40);
		btnAdd = new JButton("Add");
		btnDisplay = new JButton("Display");
		panel.add(labelFirst);
		panel.add(textFirst);
		panel.add(labelLast);	
		panel.add(textLast);
		panel.add(labelGender);
		panel.add(genderPanel);
		panel.add(labelProgram);
		panel.add(comboProgram);
		panel.add(labelSection);
		panel.add(comboSection);
		panel.add(labelBook);
		panel.add(textBook);
		panel.add(btnAdd);
		panel.add(btnDisplay);
		btnAdd.addActionListener(this);
		btnDisplay.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			
			String fname, lname, book, gender, section, program;
			
			fname=textFirst.getText().toString();
			lname=textLast.getText().toString();
			
			if(rbMale.isSelected()) {
				gender="Male";
			}else if(rbFemale.isSelected()) {
				gender="Female";
			}else {
				gender="Others";
			}
			
			program=comboProgram.getSelectedItem().toString();
			section=comboSection.getSelectedItem().toString();
			book=textBook.getText().toString();
			try {
				FileWriter fw =new FileWriter("D://Record.txt",true);
				fw.write(fname+" "+lname+" "+gender+" "+program+" "+section+" "+book);
				fw.close();
			}catch(IOException ee) {
				ee.printStackTrace();
				
			}
			
		}else {
			try {
				FileReader fr =new FileReader("D://Record.txt");
				BufferedReader br = new BufferedReader(fr);
				String str=br.readLine();
				JOptionPane.showMessageDialog(null,str,"info",JOptionPane.INFORMATION_MESSAGE);
				br.close();
				fr.close();
			}catch(IOException ee) {
				ee.printStackTrace();
				
			}
			
		}
		
	}
}
