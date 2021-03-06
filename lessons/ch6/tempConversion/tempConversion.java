/*
  Ethan R. Jones
  10-29-2014
  Temp Conversion
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class tempConversion extends JApplet implements ActionListener // ActionListener lets JButton trigger events 
{
    
    JLabel cLabel, fLabel;
    JTextField cField, fField;
    
    
    public void init()
    {
	// Initionalizes all the Applet parts.
	Container form1 = getContentPane();
	form1.setLayout(new FlowLayout());
	
	cLabel = new JLabel("Celsius");
	form1.add(cLabel);
	
	cField = new JTextField(10);
	cField.addActionListener(this);
	form1.add(cField);
	
	fLabel = new JLabel("Fahrenheit");
	form1.add(fLabel);
	
	fField = new JTextField(10);
	fField.addActionListener(this);
	form1.add(fField);
    }
    
    public void actionPerformed(ActionEvent e)
    {
	if(e.getSource() == cField)
	    {
		String c = cField.getText();
	        double cNum = Double.parseDouble(c);
		double fNum = (9.0 / 5.0) * cNum + 32;

		fField.setText("" + fNum);
	    }
	else if(e.getSource() == fField)
	    {
		String f = fField.getText();
		double fNum = Double.parseDouble(f);
		// double cNum = (fNum - 32) * 5.0 / 9.0;
		
		cField.setText("" + cNum);
	    }
    }
}
