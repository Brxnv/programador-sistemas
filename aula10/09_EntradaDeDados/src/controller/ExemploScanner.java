package controller;
import java.util.Scanner;

public class ExemploScanner {
	public static void main(String args[])
	{
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter your name:");
	  String sl = scan.nextLine();
	  System.out.println("Your name is " + sl);
	  
	  System.out.println("City name:");
	  String s2 = scan.next();
	  System.out.println("City is " + s2);
	  
	  System.out.println("Enter whole number:");
 	  int x = scan.nextInt();
 	  
 	  System.out.println("Enter double value:");
 	  double y = scan.nextDouble();
 	 
 	  System.out.println("Number are " + x + " and " + y + " and their product is" + (x*y));
 	  
 	  scan.close();
 	  
 	  System.out.println("The End.");
	}	
}