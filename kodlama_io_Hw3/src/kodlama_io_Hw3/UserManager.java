package kodlama_io_Hw3;

public abstract class UserManager {
	
	public void Add(User u) {
		System.out.println("Kullan�c� eklendi.");
	}
	public void Update(User u) {
		System.out.println("Kullan�c� g�ncellendi.");
	}
	public void Get(int id) {
		System.out.println(id + " nolu kullan�c� getirildi.");
	}
	public void Delete(User u) {
		System.out.println("Kullan�c� silindi.");
	}
}
