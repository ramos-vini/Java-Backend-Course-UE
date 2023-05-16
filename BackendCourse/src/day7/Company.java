package day7;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp("Billy", 50000.0);
		
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		
		System.out.println(emp1.name + " has a Bonus Rate of 10% and his Net Salary is "+emp1.netSalary(0.4, 0.1));
	}

}
