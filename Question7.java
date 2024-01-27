package task11;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);//getting age from user
System.out.println("Enter the age:");
int age = sc.nextInt();

if (age<18) {  //checks for the condition
	throw new InvalidAgeException ("Invalid age");
}
	}	
}	


