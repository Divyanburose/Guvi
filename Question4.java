package task11;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);//getting value from the user
	System.out.println("Enter the value of a:");
	int a = sc.nextInt();
	System.out.println("Enter the value of b:");
	int b = sc.nextInt();
	int c=0;
	try {
		 c=a/b;//critical line unchecked exception may occur
	}
	catch(ArithmeticException ae) {
		c=a/1;//Handling exception
		System.out.println("Enter a valid number for b");
		ae.printStackTrace();//t get the entire path and exception
	}
	
	System.out.println("The value of c is:"+c);

}
}