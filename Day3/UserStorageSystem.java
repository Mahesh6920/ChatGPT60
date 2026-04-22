package Day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserStorageSystem {
	
	List<User> users = new ArrayList<>();
	Set<String> emails = new HashSet<>();
	
	public boolean addUser(User user) {
		if (user == null) {
			System.out.println("Invalid user details");
			return false;
		} else if (emails.contains(user.getEmail())) {
			System.out.println("Mail already exists");
			return false;
		}
		
		users.add(user);
		emails.add(user.getEmail());
		
		
		return true;
	}
	
	public void printUsers() {
		for (User user : users) {
			System.out.println(user);
		}
	}

}
