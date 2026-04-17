package DAY1;

public class Admin extends User {

	private String adminLevel;
	
	public Admin(int id, String name, String mail, String password) {
		super(id, name, mail, password);
	}
	
	public void setAdminLevel(String adminLevel) {
		this.adminLevel = adminLevel;
	}
	
	public String getAdminLevel() {
		return adminLevel;
	}
	
	public void manageUsers() {
		System.out.println("Admin managing users...");
	}
}
