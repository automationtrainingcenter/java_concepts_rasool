package cardemo;

public class TestRun {

	public static void main(String[] args) {
		Car car = CarFactory.selectDifficulty();
		car.start();
		car.forward();
		car.forward();
		car.backward();
		car.leftTurn();
		car.rightTurn();
		car.stop();

		// type cast car object to LevelOne

		if(car instanceof LevelTwo) {
			((LevelTwo) car).levelTwoMethod();
		}else if(car instanceof LevelThree) {
			((LevelThree) car).levelThreeMethod();
		}else {
			((LevelOne) car).levelOneMethod();
		}

	}

}
