package cardemo;

public class LevelThree extends LevelOne {
	@Override
	public void forward() {
		System.out.println("moving forward and speed increased by 20kmh");
	}

	@Override
	public void backward() {
		System.out.println("moving backward and speed decreased by 15kmh");
	}

	@Override
	public void leftTurn() {
		System.out.println("taking left turn in level three");
	}

	@Override
	public void rightTurn() {
		System.out.println("taking right turn in level three");
	}
	
	public void levelThreeMethod() {
		System.out.println("level three method");
	}
}
