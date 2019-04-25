package abstraction;
/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * 
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * Type of interfaces
 * Marker or tagged interface
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */

public class AbstractionDemo {

	public static void main(String[] args) {
		// abstraction demo
//		AbstractClass obj = new AbstractClassImpl();
//		obj.methodOne();
//		obj.methodTwo();
//		obj.methodThree();
//
//		// interface demo
		InterfaceDemo iObj = new InterfaceImpl();
//		iObj.methodOne();
//		iObj.methodTwo();
//		iObj.methodThree();

//		COne cObj = new COne();
//		cObj.iOneMethod();
//		cObj.iTwoMethod();

		IOne cObj = new COne();
		cObj.iOneMethod();
		// to call iTwoMethod of ITwo interface
		ITwo c1 = (ITwo) cObj;
		c1.iTwoMethod();
//		((COne)cObj).iTwoMethod();

		// inner interfaces
		Outer oiObj = new ImplementsOuterInner();
		oiObj.methodOne();
		// call inner interface method by type casting outer interface object reference
//		Outer.Inner iiObj = (Outer.Inner)oiObj;		
//		Outer.Inner iiObj = oiObj.method();
//		iiObj.methodTwo();
		oiObj.method().methodTwo();

		/*
		 * default method of an interface can be accessed using the object reference of
		 * the interface. Default methods can be overriden in implementation classes
		 */
		iObj.defaultMethod();

		/*
		 * we can't override static method of an inteface. we can access static mehtods
		 * using interface name
		 */
		InterfaceDemo.staticMethod();

		// accessing functional interface using normal class
		FnInterfaceOne fnor = new FnInterfaceImpl();
		fnor.methodOne();

		// accessing functional interface using anonymous class
		FnInterfaceOne fanon = new FnInterfaceOne() {

			@Override
			public void methodOne() {
				System.out.println("method one from anonymous class");
			}
		};

		fanon.methodOne();

		FnInterfaceOne fanon1 = new FnInterfaceOne() {

			@Override
			public void methodOne() {
				System.out.println("new definition for method one from anonymous class");
			}
		};

		fanon1.methodOne();

		// accessing functional interface methods using lamda expressions
		FnInterfaceOne flam1 = () -> {
			System.out.println("mehtod one from lambda expression");
		};
		flam1.methodOne();

		FnInterfaceTwo flam2 = (a, b) -> {
			System.out.println(a + b);
		};
		flam2.add(10, "20");

		FnInterfaceTwo flam3 = (a, b) -> {
			if (b.matches("\\d+")) {
				int ib = Integer.parseInt(b);
				System.out.println(a+ib);
			}else {
				System.out.println(a+b);
			}
		};
		
		flam3.add(10, "sunshine");
		
		
//		FnIntefaceThree flam4 = (a,b) -> {return a+b;};
		FnIntefaceThree flam4 = (a,b) -> a+b;
		int sum = flam4.add(10,  20);
		System.out.println(sum);
	}

}
