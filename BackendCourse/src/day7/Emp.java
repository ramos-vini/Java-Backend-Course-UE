package day7;

public class Emp {
	String name;
	double salary;
	
	Emp(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public double netSalary(double taxPercent, double bonusRate) {
		return salary*(1+bonusRate) - salary*taxPercent;
	}
}
