package Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserLookupSystem {
	
	Map<Integer, User> users = new HashMap<>();
	Set<String> emails = new HashSet<>();
	
	public boolean addUser(int id, User user) {
		if (user == null) {
			System.out.println("Invalid details.");
			return false;
		} else if (emails.contains(user.getEmail())) {
			System.out.println("E-mail already exists.");
			return false;
		} else if (users.containsKey(id)) {
			System.out.println("Id: " + id + " already exists.");
			return false;
		}
		
		users.put(id, user);
		emails.add(user.getEmail());
//		System.out.println("Id: " + id + " added successfully.");
		
		return true;
	}
	
	public User getUserById(int id) {
				
		return users.get(id);
		
	}
	
	public boolean deleteUser(int id) {
		
		if (!users.containsKey(id)) {
			System.out.println("Id not exists.");
			return false;			
		}
		
		
		User removeUser = users.remove(id);
		emails.remove(removeUser.getEmail());
//		System.out.println("Id: " + id + " is removed.");
		
		return true;
	}
	
}
