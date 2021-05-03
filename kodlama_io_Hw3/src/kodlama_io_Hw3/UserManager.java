package kodlama_io_Hw3;

public abstract class UserManager {
	
	public void Add(User u) {
		System.out.println("Kullanıcı eklendi.");
	}
	public void Update(User u) {
		System.out.println("Kullanıcı güncellendi.");
	}
	public void Get(int id) {
		System.out.println(id + " nolu kullanıcı getirildi.");
	}
	public void Delete(User u) {
		System.out.println("Kullanıcı silindi.");
	}
}
