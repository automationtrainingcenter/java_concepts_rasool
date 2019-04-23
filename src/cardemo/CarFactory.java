package cardemo;

import java.util.Scanner;

public class CarFactory {
	
	public static Car selectDifficulty() {
		Car car = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("select your difficulty level 1. beginner 2. Modern 3. Expert");
		int diff = sc.nextInt();
		switch(diff) {
		case 1: 
			System.out.println("playing level one");
			car = new LevelOne();
			break;
		case 2:
			System.out.println("playing level two");
			car = new LevelTwo();
			break;
		case 3:
			System.out.println("playing level three");
			car = new LevelThree();
			break;
		default:
			System.out.println("playing level one");
			car = new LevelOne();
		}
		return car;
	}

}
