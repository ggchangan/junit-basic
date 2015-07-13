package application;

public class EmployeeDetails {
	private String name;
	private double monthlySalary;
	private int age;

	public int getAge() {
		return age;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public void setName(String name) {
		this.name = name;
	}

}
