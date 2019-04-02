package basics;
/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 *
 *
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements
 * inside else block will be executed
 *
 *
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 *
 *
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 *
 *
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1:
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 *
 *
 */

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter  a number");
		int num = s.nextInt();
		if(num % 2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
//		System.out.println("enter a number");
//		int num1 = s.nextInt();
//		System.out.println("enter second number");
//		int num2 = s.nextInt();

		// bigger number in given two numbers
//		if(num1 > num2) {
//			System.out.println("num1 is bigger");
//		}else if(num2 > num1){
//			System.out.println("num2 is bigger");
//		}else {
//			System.out.println("num1 is equal to num2");
//		}

//		if (num1 != num2) {
//			if (num1 > num2) {
//				System.out.println("num1 is bigger");
//			} else {
//				System.out.println("num2 is bigger");
//			}
//		} else {
//			System.out.println("num1 is equal to num2");
//		}

//		System.out.println("enter browser name");
//		String bname = s.next();
//		// compare browser name
//		if (bname.equalsIgnoreCase("chrome")) {
//			System.out.println("launch chrome browser");
//		} else if (bname.equalsIgnoreCase("firefox")) {
//			System.out.println("launch firefox browser");
//		} else if (bname.equalsIgnoreCase("opera")) {
//			System.out.println("launch opera browser");
//		} else {
//			System.out.println("launch IE browser");
//		}
//		bname = bname.toLowerCase();
//		switch (bname) {
//		case "chrome":
//			System.out.println("luanch chrome browser");
//			break;
//		case "firefox":
//			System.out.println("launch firefox browser");
//			break;
//		case "opera":
//			System.out.println("launch opera browser");
//			break;
//		default:
//			System.out.println("launch IE browser");
//		}
		
		
		//facebook login example
//		System.out.println("enter username");
//		String uname = s.next();
//		System.out.println("enter password");
//		String pwd = s.next();
//		
//		if(uname.equalsIgnoreCase("surya") && pwd.equals("password")) {
//			System.out.println("welcome "+uname);
//		}else {
//			System.out.println("invalid credentilas");
//		}
//		
//		
//		
//		//gmail login example
//		System.out.println("enter username");
//		String username = s.next();
//		if(username.equalsIgnoreCase("surya")) {
//			System.out.println("enter password");
//			String pass = s.next();
//			if(pass.equals("password")) {
//				System.out.println("welcome "+uname);
//			}else {
//				System.out.println("invalid password");
//			}
//		}else {
//			System.out.println("invalid username");
//		}
//		
		

	}

}
