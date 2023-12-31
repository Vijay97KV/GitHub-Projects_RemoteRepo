package encapsulation;

public class User {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge(25);
		emp.setName("suresh");
		emp.donate(15350);
//		emp.setSalary(55000);
		System.out.println(emp.getEname() + " of Age: " + emp.getAge() + " And a Salary is: " + emp.getSalary());
		emp.getDonationDetails();
	}

}
