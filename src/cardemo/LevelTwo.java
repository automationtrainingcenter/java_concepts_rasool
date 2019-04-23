package cardemo;

public class LevelTwo extends LevelOne{

	@Override
	public void forward() {
		System.out.println("moving forward and speed increased by 15kmh");
	}

	@Override
	public void backward() {
		System.out.println("moving backward and speed decreased by 20kmh");
	}

	@Override
	public void leftTurn() {
		System.out.println("taking left turn in level two");
	}

	@Override
	public void rightTurn() {
		System.out.println("taking right turn in level two");
	}
	
	public void levelTwoMethod() {
		System.out.println("level two method");
	}
	
}
