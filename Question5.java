package task11;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);//get value from the user
System.out.println("Enter the value of a:");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
int c = 0;
int arr[] = new int[3];//declaring array length
String str = "My String";//declaring string value

try {
	 c=a*b;
	 System.out.println("The value of c is:"+c);
	 System.out.println("************************");
	arr[4]=c;//critical line
	
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Adding value to 1st position");//handling exception
	e.printStackTrace();//to print the path and exception in detail
}
System.out.println("***********************");
try {
	str = "My String";
	char invalidChar = str.charAt(str.length()+1);
	
	System.out.println("The character is:"+invalidChar);
}catch(StringIndexOutOfBoundsException se) {
	System.out.println("String index out of bounds Exception is caught.");
char defaultvalue = 'X';//handling exception by giving default value
System.out.println("Using default value:"+defaultvalue);
	
	se.printStackTrace();
}









	}

	private static String strlength() {
		// TODO Auto-generated method stub
		return null;
	}

}
