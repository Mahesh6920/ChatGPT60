package Day3;

public class Main {

	public static void main(String[] args) {
		
		UserStorageSystem system = new UserStorageSystem();
		
		User user1 = new User("mahi", "mahi@gmail.com");
		User user2 = new User("ravi", "ravi@gmail.com");
		User user3 = new User("siva", "siva@gmail.com");
		
		if(system.addUser(user1)) {
			System.out.println("User added");
		}
		if (system.addUser(user2)) {
			System.out.println("User added");
		}
		if (system.addUser(user3)) {
			System.out.println("User added");
		}
		
		system.printUsers();
		
		User user4 = new User("mahi", "mahi@gmail.com");
		system.addUser(user4);

	}

}
