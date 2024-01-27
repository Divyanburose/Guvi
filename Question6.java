package task11;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);//getting value from the user
	System.out.println("Enter the password:");
	String password = sc.next();
	
	try {
		String str = "divya123";//declaring the variable
		if(password.equalsIgnoreCase(str) ) {//comparing two strings
			System.out.println("Login sucess");	//if two strings were equal then prints this
			} else {  //Invalid password exception is thrown
				throw new InvalidPasswordException ("Invalid Password");//creating user defined exception
			}
	} catch (InvalidPasswordException e) { //handling the exception
		System.out.println("Invalid Password, Please enter a valid password");
		e.printStackTrace();//to print the entire path
				
		
	}
	}
		}


