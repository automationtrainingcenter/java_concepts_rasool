package encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {

	private int id;
	private String name;
	private double fee;
	private String course;
	private long phNum;
	private double balance;

	public EncapsulationDemo(int id, String name, double fee, String course, long phNum) {
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.course = course;
		this.phNum = phNum;
		this.balance = this.fee;
	}

	public void display() {
		System.out.println("id = " + this.id + "\nname = " + this.name + "\ncourse =" + this.course + "\nfee = "
				+ this.fee + "\nphone number = " + this.phNum + "\nbalance = " + balance);
	}

	public int getId() {
		return this.id;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		if (validate()) {
			this.phNum = phNum;
			System.out.println("phone number updated successfully");
		} else {
			System.out.println("invalid credentials ...");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void payFee(double amount) {
		if (validate()) {
			if (amount > 0) {
				if (this.balance >= amount) {
					this.balance -= amount;
					System.out.println("fee paid successfully");
				} else if(this.balance == 0){
					System.out.println("total fee paid");
				}else {
					System.out.println("amount must be less than balance i.e "+this.balance);
				}
			}else {
				System.out.println("invalid amount");
			}
		} else {
			System.out.println("invalid credentials ...");
		}
	}

	public String getName() {
		return name;
	}

	public double getFee() {
		return fee;
	}

	public String getCourse() {
		return course;
	}

	private boolean validate() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter username");
		String uname = s.next();
		System.out.println("enter password");
		String pwd = s.next();
		if (uname.equals("user") && pwd.equals("sunshine")) {
			return true;
		} else {
			return false;
		}
	}

//	public void setId(int id) {
//		this.id = id;
//	}

}
