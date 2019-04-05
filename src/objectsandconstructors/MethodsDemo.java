package objectsandconstructors;
/*
 * method without input and without output
 * method without input and with output
 * method with input and without output
 * method with input and with output
 * 
 * syntax:
 * access_modifiers (static) return_type  method_name(arg1, arg2, arg3 .... argN){
 * 		statements;
 * 		statements;
 * 
 * 		return statement;
 * }
 * 
 * both arguments and return type are optional based on your type of the method
 * 
 * static method (outside the class)
 * 
 * data_type_of_return_type var_name = class_name.method_name(para1, para2, para3 ... paraN);
 * 
 * instance method (outside the class)
 * data_type_of_return_type var_name = object_of_class.method_name(para1, para2, para3 ... paraN);

 */

public class MethodsDemo {

	public void methodOne() {
		System.out.println("method without input and without output");
	}
	
	public void methodTwo(boolean arg) {
		System.out.println("method without output and with boolean input");
		System.out.println("input is "+arg);
	}
	
	
	public boolean methodThree() {
		System.out.println("method without input but with boolean output");
		return true;
	}
	
	public int methodFour(int a, int b) {
		System.out.println("method with two integer inputs with integer output");
		System.out.println("input arg1 is "+a+" input arg2 is "+b);
		System.out.println("output is sum of arg1 and arg2 ");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		obj.methodTwo(false);
		boolean result = obj.methodThree();
		System.out.println("output is "+result);
		int sum = obj.methodFour(10, 20);
		System.out.println(sum);
		
	}

}
