package basics;

import java.util.Scanner;

public class ReadData {
	
	/* In java we have Scanner class
	 * which will have several methods to read different types of data
	 */
	public static void main(String[] args) {
		
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//read an integer from the console
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("number you entered is "+num);
		
		
		//read a double number
		System.out.println("enter a decimal point number");
		double dbNum = sc.nextDouble();
		System.out.println("double number you entered is "+dbNum);
		
		//read boolean value
		System.out.println("enter a boolean value");
		boolean b = sc.nextBoolean();
		System.out.println("boolean value you entered is "+b);
		
		
		//read a string value
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("your name is "+name);
		
		
		//read a character value
		//in String class we have charAt(int arg) which returns a single character at a given
		//index number and index number always starts with 0
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		System.out.println("character you entered is "+ch);
	}

}
