package abstraction;

public class InterfaceImpl implements InterfaceDemo {

	@Override
	public void methodOne() {
		System.out.println("interface method one definition");
	}

	@Override
	public void methodTwo() {
		System.out.println("interface method two definition");
	}

	@Override
	public void methodThree() {
		System.out.println("interface method three definition");
	}

	@Override
	public void defaultMethod() {
		System.out.println("default method of Inteface impl");
	}

}
