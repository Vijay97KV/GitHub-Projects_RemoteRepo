package encapsulation;

public class Employee {

	
	
	private String name;
	private int age;
	private int salary;
	private double donation;

	public String getEname() {
		return name;

	}

	public int getAge() {
		return age;

	}

	public void setName(String ename) {
		this.name = ename;

	}

	public void setAge(int eage) {
		this.age = eage;

	}

	public int getSalary() {
		salary = 12000;
		return salary;

	}

	private void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void donate(int donation) {
		this.donation = donation;

	}
	
	protected void getDonationDetails() {
		System.out.println(donation);
	}
}
