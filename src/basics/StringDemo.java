package basics;
/*
 * String is a collection of characters
 * Strings are immutable in Java i.e we can't change String values
 * Strings will be stored in a separate memory location known as String constant pool
 * 
 * declare String variable
 * String var_name;
 * 
 * initialize a String variable
 * String var_name = "value";
 * 
 * we can access String values using it's variable name
 * 
 */

public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "selenium";
		
		String s2 = " webdriver";
		
		String s3 = s1 + s2;
		
		String s4 = s1;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		s1 = "python";
			
		System.out.println(s1.hashCode());
		
	}
	

}
