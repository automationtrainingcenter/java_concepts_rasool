package cardemo;

public class LevelOne implements Car{

	@Override
	public void start() {
		System.out.println("car started");
	}

	@Override
	public void forward() {
		System.out.println("moving forward and speed increased by 5kmh");
	}

	@Override
	public void backward() {
		System.out.println("moving backward and speed decreased by 10kmh");
	}

	@Override
	public void leftTurn() {
		System.out.println("taking left turn");
	}

	@Override
	public void rightTurn() {
		System.out.println("taking right turn");
	}

	@Override
	public void stop() {
		System.out.println("car stopped");
	}
	
	
	//method only in Level one
	public void levelOneMethod() {
		System.out.println("level one method");
	}
	

}
