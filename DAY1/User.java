package DAY1;

public class User {

	private int id;
	private String name;
	private String mail;
	private String password;
	
	public User(int id, String name, String mail, String password) {
		setId(id);
		setName(name);
		setMail(mail);
		setPassword(password);
	}
	
	public void setId(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMail(String mail) {
		if (mail == null || !mail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			throw new IllegalArgumentException("Invalid Mail");
		}
		
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setPassword(String password) {
		if (password == null) {
			throw new IllegalArgumentException("Invalid Password");
		} else if (password.length() < 6){
			throw new IllegalArgumentException("Password must contain 6 characters");
		}
		
		this.password = password;
	}
		
}
