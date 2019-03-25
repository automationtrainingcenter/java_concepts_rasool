package basics;

public class TestInstanceVsStatic {
	public static void main(String[] args) {
		InstanceVsStatic.institueName = "SSTS";

		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.name = "sharath";

		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.name = "srikanth";

		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.name = "venkat";

		obj1.display();
		obj2.display();
		obj3.display();

		obj2.name = "vasu";

		obj1.name = "rasool";

		InstanceVsStatic.institueName = "sunshine";
		obj1.display();
		obj2.display();
		obj3.display();

	}
}
