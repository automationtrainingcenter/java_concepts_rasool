package accessmodifiers;
/*
 * In Java we have 4 accesss modifiers
 * public - can be accessed any where
 * private - can be accessed with in the class
 * default - can be accessed with in the package
 * protected - same as default, outside the package child class object can access
 * parent class Protected variables and methods
 */


public class AccessModifiersDemo {
	public int pVar = 10;
	private int prVar = 20;
	int dVar = 30;
	protected int proVar = 40;
	
	
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}
}
