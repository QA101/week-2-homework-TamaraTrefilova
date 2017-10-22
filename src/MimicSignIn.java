import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This programming challenge requires the use of string methods, for loops, and nested if statements
 * This program is intended to mimic a log-in string in a terminal window and validation of an email address
 * 
 * This is a challenge exercise and will require time to investigate.
 * 
 * @author dustin
 *
 */
public class MimicSignIn {

	/**
	 * Main method should first read arguments from terminal.
	 * first argument -> username
	 * second argument -> password
	 * third argument -> email
	 * If the number of argument is not equal to 3, the program should exit immediately.
	 * 
	 * Then, the program should ask the user to sign in (username and password)
	 * 
	 * They have three attempts to log in, otherwise it should exit
	 * 
	 * Finally, it should tell them if they have a valid email address
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  TODO Check if the arguments is the right length.
		 *  If not the right length, exit immediately.
		 */ 
		final int MAX_ATTEMPTS = 3;
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your user name, password and e-mail");
		String str = console.nextLine();
		String [] list = str.split(" ");
		String username_attempt = "";
		String password_attempt = "";	
		String username = "";
		String password = "";
		String email =  "";				
		if(list.length == MAX_ATTEMPTS) {
			 username = list[0];
			 password =  list[1];
			 email =  list[2];				
			
			/**
			 *  TODO write a code block that check if the user supplied the correct username and password
			 *  You should use a for loop
			 *  You should trim off spaces in-front of or after the string
			 *  Then compare the username_attempt to username and password_attempt to password
			 */
			int attempt = 0;
			for(int i = 0; i<MAX_ATTEMPTS; i++){		
				System.out.println("Enter Username:");
				username_attempt = console.next();
				System.out.println("Enter Password:");
				password_attempt = console.next();
				if(!username.equals(username_attempt)||!password.equals(password_attempt)){
					System.out.println("Invalid Credentials, try again");
					attempt++;
				}
				if(attempt==0) {
					i=3;
				}
				if(attempt==3) {
					System.out.println("You exceed the maximum number login attemps");
					break;
				}
			}
			
			/**
			 * What is a valid email address?
			 * 
			 */
			
			if(ValidEmail(email)) {
				System.out.println("You have a valid email address");
			}	else {				
				System.out.println("You do not have a valid email address");
			}
			
			//closing console
			console.close();
		}	else {
			System.out.println("wrong number of elements");
		}
	}
	
	/**
	 * This method will take an email string and valid if it has a valid format
	 * 
	 * @param email - email string which needs to be validated  for the correct format
	 * @return - returns true if the email is valid, returns false if it is not valid
	 */
	public static boolean ValidEmail(String email) {
		System.out.println("Enter you email");
		Scanner console = new Scanner(System.in);
		if (console.next().equals(email)) {
			console.close();
			return true;
		} else {
			console.close();
			return false;
		}	
	}
}
