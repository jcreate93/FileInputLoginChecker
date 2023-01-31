/**This class checks that the input username and password (from LoginChecker class) are within the constraints
 * @version 1.0
 * @author Julie Chambers
 */

public class Validator extends LoginChecker{   
	
	private String username;
	private String password;
	

	boolean foundDigit = false;
	boolean foundUpperCase = false;
	boolean foundLowerCase = false;
	boolean foundSymbol = false;
	boolean foundLength = false;
	
	
	//setters
	/**
	 * This setter checks that the sent username (also known as inputUsername) is compliant with the constraints: must contain lowercase, uppercase and digits
	 * @param username :: variable comes from LoginChecker class scanner inputUsername, then changes the variable to 
	 * username when it reaches Validator class. Then equates username to username variable in Validator class with the this modifier
	 */
	public void setUsername(String username) {
		for (int i = 0; i < username.length(); ++i) {
			
			
			if (username.charAt(i) >= 'a' && username.charAt(i) <= 'z') {
				foundLowerCase = true;
			}
			
			
			if (username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') {
				foundUpperCase = true;
			}
			
		
			if (Character.isDigit(username.charAt(i))) {
				foundDigit = true;
			}
			if (foundLowerCase && foundUpperCase && foundDigit) {
				this.username = username;
			}
		}
		
		if (!foundLowerCase) {
			System.out.println("Username must contain lowercase letters.");
			}
		if (!foundUpperCase) {
			System.out.println("Username must contain uppercase letters.");
			}
		if (!foundDigit) {
			System.out.println("Username must contain digits. ");
		}
	}
	
	/**
	 * 
	 * @param password :: variable comes from LoginChecker class scanner  inputPassword, then changes the variable to password when it
	 *  reaches Validator class. Then equates password to password variable in Validator class with the this modifier
	 */
	public void setPassword(String password){
		for (int i = 0; i < password.length(); ++i) {
			
			//checks if lowercase letters are present
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				foundLowerCase = true;
			}
			
			//checks if uppercase letters present
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				foundUpperCase = true;
			}
			
			//checks if string has digits
			if (Character.isDigit(password.charAt(i))) {
				foundDigit = true;
			}
			if(!Character.isLetterOrDigit(password.charAt(i))){ 
				foundSymbol = true;
				}
			
			//if all criteria met then equate this.password to password
			if (foundLowerCase && foundUpperCase && foundDigit && foundSymbol) {
				this.password = password;
			}
		}
		//what happens if requirements arn't met
		if (!foundLowerCase) {
			System.out.println("Password must contain at least 1 lowercase letter.");
		}
		if (!foundUpperCase) {
			System.out.println("Password must contain at least 1 uppercase letter.");
		}
		if (!foundSymbol) {
			System.out.println("Password must contain at least 1 symbol.");
		}
		if (!foundDigit) {
			System.out.println("Password must contain digits.");
		}
	}

	
	
	/**
	 * 
	 * @return username variable to main
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 
	 * @return password variable to main
	 */
	public String getPassword() {
		return password;
	}


}
