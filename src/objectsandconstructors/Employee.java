package objectsandconstructors;

public class Employee {

	int empId = 123100;
	String name;
	String address;
	String panNum;
	long aadhar;
	long phNum;
	double salary;
	private static int i = 1;

	private Employee() {
		this.empId += i;
		i++;
	}

	public Employee(String name, String address, long phNum, double salary) {
		this();
		this.name = name;
		this.address = address;
		this.phNum = phNum;
		this.salary = salary;
	}

	public Employee(String name, String address, String panNum, long phNum, double salary) {
		this(name, address, phNum, salary);
		this.panNum = panNum;
	}

	public Employee(String name, String address, long aadhar, long phNum, double salary) {
		this(name, address, phNum, salary);
		this.aadhar = aadhar;
	}

	public void display() {
		System.out.println("id = " + this.empId + "\nname = " + this.name + "\naddress = " + this.address + "\nphNum = "
				+ this.phNum + "\nsalary = " + this.salary);
		if (this.aadhar != 0) {
			System.out.println("aadhar num = " + this.aadhar);
		}
		if (this.panNum != null) {
			System.out.println("pan num = " + this.panNum);
		}
		System.out.println("*************************************************************");
	}

}
