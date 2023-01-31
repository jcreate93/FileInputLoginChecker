import java.util.Hashtable;

import javax.swing.JFrame;

public class LoginApp {

	public static void main(String[] args) {
		//new
		JFrame frame = new JFrame();
		//LoginChecker lc = new LoginChecker();
	Hashtable<String, String> hashTable = new Hashtable<String, String>();
		
		hashTable.put("Person1!", "Password1!");
		hashTable.put("Person2@", "Password2@");
		
		//objects that allow access to the Validator class
		Validator user = new Validator();  //object for username
		Validator pass = new Validator();  //object for password
		System.out.println("Displaying entries in hash table: " +hashTable);
		//variables for user input
				String userInput;   
				String passInput;
				boolean foundPass = false;
				boolean foundUser = false;
		
				//username
				userInput = LoginChecker.usertextField.getText();
				user.setUsername(userInput);
				user.getUsername();
				
				
				//user enters password - password must contain uppercase, lowercase, digits, and symbol
				passInput = LoginChecker.passtextField.getText();
				pass.setPassword(passInput);  //sends the scanner variable passInput to validate it in Validator class
				pass.getPassword();				  //gets the password variable from Validator class
	
	
	
				System.out.println("Verifying your username and password.");
				   
		    	if(hashTable.get(userInput) != null && hashTable.get(userInput)==passInput) {    //checks if the hash table contains the username entered aka the key
		    		foundUser = true;
		    		System.out.println("Username verified.");
		    		if(hashTable.get(passInput) != null) {    //checks if the hash table contains the password entered aka the value
			    		foundPass = true;
			    		System.out.println("Password verified.");
			    		
			    		return;
			    	}
		    		else {
		    			System.out.println("Password is incorrect.");
		    			return;
		    			}
		    		}
		    		
		    	 System.out.println("Username not found");
		
			    
		    	}

}
