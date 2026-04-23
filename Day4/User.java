package Day4;

public class User {
	
	private String name;
	private String email;
	
	public User(String name, String email) {
		if (name == null || email == null || name.isEmpty() || email.isEmpty()) {
			throw new IllegalArgumentException("User details required.");
		} else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			throw new IllegalArgumentException("Invalid email");
		}
		
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " E-mail: " + email;
	}
}
