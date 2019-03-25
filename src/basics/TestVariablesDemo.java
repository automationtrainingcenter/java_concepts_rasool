package basics;

public class TestVariablesDemo {

	public static void main(String[] args) {
		//accessing static variable of VariablesDemo class
		System.out.println("static variable value outside the class "+VariablesDemo.sVar);
		
		//create an object of VariablesDemo class to access instance variable
		VariablesDemo obj = new VariablesDemo();
		System.out.println("instance variable value outside the class "+obj.iVar);
		
		obj.insMethod();

	}

}
