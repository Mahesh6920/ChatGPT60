package Day3;

public class User {
	
	private String name;
	private String email;
	
	public User(String name, String email) {
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			throw new IllegalArgumentException("Invalid email");
		}
		
		this.name = name;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " -> " + email;		
	}
	
		
	
}
