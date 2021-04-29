package javaKampHw2;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println("Instructor : " + user.getFirstName()+ " " + user.getLastName() + " added.");
		
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Instructor : " + user.getFirstName()+ " " + user.getLastName() + " deleted.");
		
	}
	
	@Override
	public void update(User user) {
		System.out.println("Instructor : " + user.getFirstName()+ " " + user.getLastName() + " update.");
		
	}
}
