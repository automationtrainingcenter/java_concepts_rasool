package abstraction;
/*
 * we can access inner interface using outer interface name
 */

public class ImplementsOuterInner implements Outer, Outer.Inner{

	@Override
	public void methodOne() {
		System.out.println("outer inteface method one");
	}
	
	@Override
	public Inner method() {
		return this;
	}

	@Override
	public void methodTwo() {
		System.out.println("inner interface method two");
	}

	

}
