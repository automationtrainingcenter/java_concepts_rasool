package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationDemo s1 = new EncapsulationDemo(101, "jyothi", 8000.00, "selenium", 9988866555l);
		s1.display();
//		s1.setPhNum(9996667770l);
		s1.payFee(18000);
		System.out.println(s1.getBalance());
//		s1.payFee(6000);
//		System.out.println(s1.getBalance());
	}
}
