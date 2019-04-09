package objectsandconstructors;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("rasool", "huda colony", 8887771100l, 65000.00);

		Employee e2 = new Employee("navya", "kPHB", 1234567898765432l, 8899966555l, 40000.00);

		Employee e3 = new Employee("jyothi", "miyapur", "apqz1234k", 7778899977l, 38000.00);
		e2.display();
		e1.display();
		e3.display();

	}

}
