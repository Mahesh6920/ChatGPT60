package Day4;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Mahi", "mahi@gmail.com");
		User user2 = new User("Mahi", "mahi1@gmail.com");
		
		UserLookupSystem ul = new UserLookupSystem();
		if (ul.addUser(100, user1)) {
			System.out.println("Id: " + 100 + " is added succesfully.");
		}
		if (ul.addUser(101, user2)) {
			System.out.println("Id: " + 101 + " is added successuly.");
		}
		
		User userP1 = ul.getUserById(100);
		User userP2 = ul.getUserById(101);
		System.out.println(userP1);
		System.out.println(userP2);
		
		
		ul.deleteUser(100);

		User updatedUser = ul.getUserById(100);
		System.out.println(updatedUser);
		
	}

}
