package kodlama_io_Hw3;

public class Instructor extends User {
	private String Department;
	private String Degree;
	private double Salary;

	
	public Instructor(int id, String name, String lastName, String email, int age, String department, String degree,
			double salary) {
		super(id, name, lastName, email, age);
		this.setDepartment(department);
		this.setDegree(degree);
		this.setSalary(salary);
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
}
