package basics;

import java.util.Scanner;

/*
 * If we want to execute a block of code for certain number of times then 
 * we are going to use loops
 * Every loop will have three parts
 * 1. initialization
 * 2. condition
 * 3. increment or decrement

 * In Java we have mainly 4 types of loops
 * Infinite loop: A loop which will run forever
 * 
 * 1. while loop
 * 		initialization;
 * 		while(expression){
 * 			statements;
 * 			increment/decrement;
 * 		}
 *  While will verify the condition first then only it'll execute the statements. 
 * 	i.e If the while condition is true then the statements inside the while block will be executed
 * 	The minimum iteration count is 0
 * 	
 * 2. do while loop
 * 		initialization;
 * 		do{
 * 			statements;
 * 			increment/decrement;
 * 		}while(expression);
 *  do-while loop will execute the statement inside the do block for first time then it will verify 
 *  the condition of while . If it is true then the statements inside do block will repeat execution 
 *  else do-while block will be terminated.
 *  The minimum iteration count is 1
 * 
 * 3. for loop
 * 		for(initialization; expression; increment/decrement){
 * 			statements;
 * 		}
 * The minimum iteration count is 0
 * 
 * 4. for-each loop
 * 		It is used iterate over an array or collection
 * 		for(array_type var_name : array_var_name){
 * 			statements;
 * 		}
 * 
 * 
 * we can terminate the loop based on some expression using "break" statement
 * we can skip the current iteration of the loop based on some condition using "continue" statement
 */
public class LoopsDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// while loop to print even number until 10 from 0
		// initialization
		int i = 0;
		// condition
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			// increment
			i++;
		}

		// read the numbers from the console until the number is divisible of 5
		int num;
		do {
			System.out.println("enter a number");
			num = s.nextInt();
		} while (num % 5 != 0);

		// print multiples of a given number from 1 to that number
		System.out.println("enter a number to print multiples");
		int n = s.nextInt();
		for (int j = 1; j <= n; j++) {
			System.out.println(j * n);
		}

		// verify given number is prime number or not
		System.out.println("enter a nubmer to verify prime or not");
		int primeOrNot = s.nextInt();
		boolean flag = false;
		int j;
		for (j = 2; j <= (primeOrNot / 2); j++) {
			if (primeOrNot % j == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("given number is not a prime. it is divisible by " + j);
		} else {
			System.out.println("given number is a prime number");
		}

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char vowel : vowels) {
			System.out.println(vowel);
		}

		String[] names = { "vasu", "rasool", "jyothi", "navya", "harish", "tarun", "satish", "venkat", "kala" };
		for (String name : names) {
			System.out.println(name + " contains " + name.length() + " characters");
		}

		// print prime numbers until given number
		System.out.println("enter a number");
		int range = s.nextInt();

		for (int number = 2; number <= range; number++) {
			boolean status = true;
			for (int k = 2; k <= number / 2; k++) {
				if (number % k == 0) {
					status = false;
					break; // inner for loop i.e k loop
				}
			}
			if (status) {
				System.out.print(number + "\t");
			}
		}

		// break statement demo
		j = 0;
		while (j < 10) {
			System.out.println(j);
			j++;
			if (j == 5) {
				break;
			}
		}

		// continue statement demo
		j = 0;
		while (j < 10) {
			j++;
			if (j == 5) {
				continue;
			}
			System.out.println(j);
		}

	}

}
