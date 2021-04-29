package javaKampHw2;

public class UserManager {
     
	public void add(User user) {
		System.out.println(" kullan�c� kaydedildi.");
	}
	
	public void addMultiple(User[] user) {
		for (User users : user) {
			add(users);
		}
	}
	
	public void delete (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : user deleted.." );
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : user updated..");
	}
}
