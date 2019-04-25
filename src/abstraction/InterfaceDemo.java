package abstraction;

public interface InterfaceDemo {

	// in interface all the methods are by default public and abstract
//	public abstract void methodOne();

	void methodOne();

	void methodTwo();

	void methodThree();

	public default void defaultMethod() {
		System.out.println("default method of interface demo");
	}

	public static void staticMethod() {
		System.out.println("static method of interface demo");
	}

}
