package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Exception means interruption to the normal flow of execution.
 * Generally we have two types of exceptions
 * 1. checked exceptions also known compile time exception
 * 		These are the exceptions which will extends Exception class
 * 	 we can handle checked exception either by throwing that exception or by handling that exception using
 * try and catch blacks
 * 2. unchecked exceptions also known as runtime exception
 * 		These are the exceptions which will extends RuntimeException class
 * 	we can handle unchecked exception using try and catch block
 * 
 * try block contains the code which will rise an exception
 * 
 * catch block will catch that exception and handles that exception
 * 
 * finally block will execute the statement irrespective of exception
 * 
 * throws keyword will throw the exception to the corresponding method declaration
 */
public class ExceptionHandling {

	public static void myException(boolean arg) throws Exception {
		if (!arg) {
			throw new Exception("this is custom exception");
		}
	}

	public static void launchBrowser(String browserName) throws InvalidBrowserException {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("chrome browser luanching");
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("firefox browser launching");
		}else {
			throw new InvalidBrowserException("browser name must be either chrome or firefox");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\selenium\\Notes\\Annotations flow of execution.rtf");
		} catch (FileNotFoundException e) {
			System.out.println("file is not available in the specified location");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass().getName());
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String s = "sunshine";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
//		try {
//			System.out.println(s.charAt(2));
//			System.out.println(vowels[3]);
//			System.out.println(s.indexOf('n') / 0);
//		} catch (StringIndexOutOfBoundsException e) {
////			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}

		try {
			System.out.println(s.charAt(2));
			System.out.println(vowels[1]);
			System.out.println(s.indexOf('n') / 1);
			myException(true);
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block");
		}
		
		try {
			launchBrowser("safari");
		} catch (InvalidBrowserException e) {
			e.printStackTrace();
		}
		
	}

}
