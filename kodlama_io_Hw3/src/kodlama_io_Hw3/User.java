package kodlama_io_Hw3;

public abstract class User {
	private int Id;
	private String Name;
	private String LastName;
	private String Email;
	private int Age;
	
	
	public User(int id, String name, String lastName, String email, int age) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setAge(age);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
