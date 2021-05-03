package kodlama_io_Hw3;

public class Student extends User {
	private String StudentNumber;

	public Student(int id, String name, String lastName, String email, int age, String studentNumber) {
		super(id, name, lastName, email, age);
		this.setStudentNumber(studentNumber);
	}

	public String getStudentNumber() {
		return StudentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}
	
}
