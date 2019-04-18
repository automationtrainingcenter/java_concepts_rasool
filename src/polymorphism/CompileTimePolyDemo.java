package polymorphism;

public class CompileTimePolyDemo {

	public void add(int a, String b) {
		System.out.println(a+Integer.parseInt(b));
	}

	// change in type of arguments
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	//change in sequence of arguments
	public void add(String a, int b) {
		System.out.println(Integer.parseInt(a)+b);
	}

	//change in number of arguments
	public void add(int a, String b, int c) {
		System.out.println(a+Integer.parseInt(b)+c);
	}
	
	//by simply changing the return type of the method we can't achieve compile time polymorphism
//	public int add(int a, int b) {
//		
//	}
}
