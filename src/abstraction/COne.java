package abstraction;

public class COne implements IOne, ITwo {

	@Override
	public void iOneMethod() {
		System.out.println("IOne method implemented in COne");
	}

	@Override
	public void iTwoMethod() {
		System.out.println("ITwo method implmented in COne");
	}

}
