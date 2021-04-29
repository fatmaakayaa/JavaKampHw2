package javaKampHw2;

public class StudentManager extends UserManager{
	
	@Override
	
	public void add(User user) {
		System.out.println("Student : " + user.getFirstName() + " " + user.getLastName() + " user added.");
 }

    @Override
	
	public void delete(User user) {
		System.out.println("Student : " + user.getFirstName() + " user deleted.");
 }

    @Override

     public void update(User user) {
	System.out.println("Student : " + user.getFirstName() + " user updated.");
 }

    public void getAll(Student[] students) {
      for (Student student : students) {
		System.out.println(student.getFirstName());
	}
    }
}
