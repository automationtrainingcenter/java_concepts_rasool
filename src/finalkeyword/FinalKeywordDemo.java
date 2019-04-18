package finalkeyword;
/*
 * we can declare a variable or method or a class as final
 * if we declare a variable as final we can't change it's value
 * if we declare a method as final we can't override that method in child class
 * if we declare a class as final, no class can extends this final class
 * A final class can have a Parent but it can't have child classes
 * 
 */

public class FinalKeywordDemo {

	final int i = 20;

	public static void main(String[] args) {
		FinalKeywordDemo obj = new FinalKeywordDemo();
//		obj.i = 30;
	}

}
