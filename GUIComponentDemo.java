
//  Created by Clayton Paplaczyk
//This program demonstrate the common components of GUI
//JButton, JLabel, JTextField, JTextArea, JCheckBox
//JRadioButton, JComboBox

import javax.swing.*; // to use Japplet, JButton, etc
import java.awt.*;    // to import FlowLayout manager

public class GUIComponentDemo extends JFrame
{
  	//This frame will contain the following components
  	 JButton button;
  	 JLabel label;
  	 JTextField textField;
  	 JTextArea textArea;
  	 JCheckBox checkBox;
  	 JRadioButton radioButton;
  	 JComboBox comboBox;

  	//constructor. intialize above components
  	public GUIComponentDemo()
  	{
     	//set the layout manager to be FlowLayout
     	//align to left, horizontal gap = 10 and vertical gap = 20
     	setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

    	//Button
    	button = new JButton("A Button");

    	//Label
    	label = new JLabel("A Label");

    	//TextField
    	textField = new JTextField("TextField, Enter text here");

    	//TextArea with the original text "TextArea" and 5 rows, 4 columns
    	textArea = new JTextArea("TextArea", 5, 4);

		//CheckBox
    	checkBox = new JCheckBox("CheckBox");

    	//RadioButton
    	radioButton = new JRadioButton("RadioButton");

    	//ComboBox. A comboBox with choices "Red", "Green", "Blue"
    	comboBox = new JComboBox(new String[] {"Red", "Green", "Blue"});

    	// add above components to the frame
		this.add(button);
		add(label);
		add(textField);
		add(textArea);
		add(checkBox);
		add(radioButton);
    	add(comboBox);
	}

    public static void main(String[] args)
	{
		//create an object
		GUIComponentDemo frame = new GUIComponentDemo();

		//demonstrate the .setText(), getText() methods
		//System.out.println("label test is: " + frame.label.getText());
		//frame.label.setText("Changing the text now");

		//title of the frame
		frame.setTitle("Common GUI Components Demo");

		//Set the frame width & heigth
		frame.setSize(400, 400);

		//exit upon closing window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//center the frame
		frame.setLocationRelativeTo(null);

		//display the frame
		frame.setVisible(true);
	}
 }