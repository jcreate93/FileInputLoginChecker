/**
 * This class asks users for username and password. It then sends the answers to the Validator class to verify that the input is within the constraints.
 * @version 2.0
 * @author Julie Chambers
 */


/*
 * Create a class "LoginChecker"  that reads the login and password from the user and makes sure they have the right format then compares them to the correct user and password combination that it should read from a file on the system.

Assignment Tasks 

The detailed steps are as follows: 

1-The program starts by reading login and password from the user.   

2- Use the code you built for Assignment 7 Task 2 of SENG101 to validate the format of the password. you can use the same validation rules used in that assignment. You are allowed to use any functions in the String library to validate the password as well. Here are suggestions for the valid formats if you need them.  

A- User name should be 6-8 alphanumeric characters, 

B- Password is 8-16 alphanumeric and may contain symbols.

3- The program will confirm if the user name and password have the required format before checking if they are the correct user/password 

4- If the correct format is not provided, the program will keep asking the user to enter login or password again

5- Relevant output messages are expected with every step.

6- Once the format is confirmed, the system will check the login and password against  the real login and password that are stored in a file stored in the same folder as the code.

7- For testing purposes, create a sample file named confidentialInfo.txt 

8- the file structure will be as follows:

first line is the number of logins/passwords combinations

following line is first login 

following line is  the password 

following line is  the next login and so on.  

9- the program should include comments which make it ready to generate API documentation once javadoc is executed. (7.17 for reference) 

A -Documentation is expected for every class and member variables and methods.  

10- Once the main use case is working correctly, test the following edge cases and document the results.  

A- what happens if the filename you sent does not exist?

B- what happens if it exists but is empty?

C- what happens if the number of login/password combinations you in the first line of the file is more than the actual number combinations in the file ? what about if it was less? 

11- Generate the documentation in html format and submit it with the project. 


 */

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

//username is key password is value for hashtable
public class Gui extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField usertextField;
	static JTextField passtextField;
	public Gui() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_2 = new JLabel("Enter username and password.");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 3;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		usertextField = new JTextField();
		GridBagConstraints gbc_usertextField = new GridBagConstraints();
		gbc_usertextField.anchor = GridBagConstraints.WEST;
		gbc_usertextField.insets = new Insets(0, 0, 5, 5);
		gbc_usertextField.gridx = 4;
		gbc_usertextField.gridy = 3;
		getContentPane().add(usertextField, gbc_usertextField);
		usertextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 5;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		passtextField = new JTextField();
		GridBagConstraints gbc_passtextField = new GridBagConstraints();
		gbc_passtextField.insets = new Insets(0, 0, 5, 5);
		gbc_passtextField.anchor = GridBagConstraints.WEST;
		gbc_passtextField.gridx = 4;
		gbc_passtextField.gridy = 5;
		getContentPane().add(passtextField, gbc_passtextField);
		passtextField.setColumns(10);
		
		JButton enterButton = new JButton("Enter");
		GridBagConstraints gbc_enterButton = new GridBagConstraints();
		gbc_enterButton.insets = new Insets(0, 0, 0, 5);
		gbc_enterButton.gridx = 4;
		gbc_enterButton.gridy = 7;
		getContentPane().add(enterButton, gbc_enterButton);
		
		
		this.setSize(400, 300);
		setVisible(true);
		
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	

	
	
	
	}
}

	

	


