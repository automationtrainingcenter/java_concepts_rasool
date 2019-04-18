package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo {

	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.dVar);
//		System.out.println(obj.proVar);

		ProtectedDemo pObj = new ProtectedDemo();
		System.out.println(pObj.pVar);
//		System.out.println(pObj.dVar);
		System.out.println(pObj.proVar);
//		System.out.println(pObj.prVar);
	}

}
