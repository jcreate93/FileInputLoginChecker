import java.util.Hashtable;

import javax.swing.JFrame;

public class LoginApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		//LoginChecker lc = new LoginChecker();
	Hashtable<String, String> hashTable = new Hashtable<String, String>();
		
		hashTable.put("Person1!", "Password1!");
		hashTable.put("Person2@", "Password2@");
		
		
		Validator user = new Validator();  
		Validator pass = new Validator();  
		System.out.println("Displaying entries in hash table: " +hashTable);
		
				String userInput;   
				String passInput;
				boolean foundPass = false;
				boolean foundUser = false;
		
				
				userInput = Gui.usertextField.getText();
				user.setUsername(userInput);
				user.getUsername();
				
				
				
				passInput = Gui.passtextField.getText();
				pass.setPassword(passInput);  
				pass.getPassword();				  
	
	
	
				System.out.println("Verifying your username and password.");
				   
		    	if(hashTable.get(userInput) != null && hashTable.get(userInput)==passInput) {    
		    		foundUser = true;
		    		System.out.println("Username verified.");
		    		if(hashTable.get(passInput) != null) {    
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
