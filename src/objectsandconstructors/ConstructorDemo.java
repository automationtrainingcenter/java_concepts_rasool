package objectsandconstructors;

import java.util.Scanner;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters or type of parameters, 
 *  this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

public class ConstructorDemo {

	int id;
	String name;
	long phNum;
	double fee;

//	// default constructor
	public ConstructorDemo() {
		System.out.println("creating object using default constructor");
		id = 100;
		name = "jyothi";
		phNum = 9988877755l;
		fee = 8000.0;
	}

	// parameterized constructor
	public ConstructorDemo(int id, String name, long phNum, double fee) {
		System.out.println("creating object using parameterized constructor");
		this.id = id;
		this.name = name;
		this.phNum = phNum;
		this.fee = fee;
	}
	
	//changing the sequence of arguments
	public ConstructorDemo(String name, long phNum, int id, double fee) {
		this(id, name, phNum, fee);
	}
	
	//changing the type of arguments
	public ConstructorDemo(String name, String phNum, String id, String fee) {
//		this.name = name;
//		this.id = Integer.parseInt(id);
//		this.phNum = Long.parseLong(phNum);
//		this.fee = Double.parseDouble(fee);
		this(name, Long.parseLong(phNum), Integer.parseInt(id), Double.parseDouble(fee));
	}
	
	
	public void display() {
		System.out.println("*********************************************");
		System.out.println("id "+id+"\nname "+name+"\nphone number "+phNum+"\nfee "+fee);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj1 = new ConstructorDemo();
		obj1.display();
		ConstructorDemo obj2 = new ConstructorDemo(110, "surya", 9998887778l, 8000.00);
		obj2.display();
		ConstructorDemo obj3 = new ConstructorDemo();
		obj3.display();
		ConstructorDemo obj4 = new ConstructorDemo(111, "ravi", 8888776655l, 8000.00);
		obj4.display();
		
		
	}

}
