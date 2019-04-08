package objectsandconstructors;

public class Student {
	
	//properties
	String name;
	String address;
	long phNum;
	String email;
	String courseName;
	double fee;
	
	
	//store student details
	public void createStudent(String n, String add, long pn, String mail, String cn, double f) {
		name = n;
		address =add;
		phNum = pn;
		email = mail;
		courseName = cn;
		fee = f;
	}
	
	
	//update phnum
	public void updatePhNum(long newPhNum) {
		phNum = newPhNum;
		System.out.println("phone number updated succesfully");
	}
	
	// update email
	public void updateEmail(String newEmail) {
		email = newEmail;
		System.out.println("email updated succesfully");
	}
	
	
	//update address
	public void updateAddress(String newAddress) {
		address = newAddress;
		System.out.println("address updated succesfully");
	}
	
	//get details
	public void getStudentDetails() {
		System.out.println("Name "+name);
		System.out.println(("address "+address));
		System.out.println("phNum "+phNum);
		System.out.println("email "+email);
		System.out.println("course "+courseName);
		System.out.println("fee "+fee);
	}
	
	public static void main(String[] args) {
		//create an object of a student
		Student s1 = new Student();
		
		s1.createStudent("vasu", "lingampally", 9877766777l, "vasu@gmail.com", "selenium", 8000.00);
		Student s2 = new Student();
		s2.createStudent("rasool", "chandanagar", 8889966777l, "rasool@gmail.com", "selenium", 8000.00);
		
		s1.getStudentDetails();
		s2.getStudentDetails();
		
		s1.updatePhNum(7788987659l);
		s1.getStudentDetails();
		
		s2.updateEmail("rasool123@gmail.com");
		s2.updateAddress("kukatpally");
		System.out.println("student 2 details after update");
		s2.getStudentDetails();
		
		Student s3 = new Student();
		s3.getStudentDetails();
	}
	

}
