package javaKampHw2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("Fatma");
        student.setLastName("Kaya");
        student.seteMail("frukiyekayaa@gmail.com");
        student.setCoursesApplied("Yaz�l�m Geli�irici Kamp� JAVA + REACT ");
        
        Instructor �nstructor = new Instructor();
        �nstructor.setId(2);
        �nstructor.setFirstName("Engin");
        �nstructor.setLastName("Demiro�");
        �nstructor.seteMail("engindemirog@gmail.com");
        �nstructor.setCoursesInstructor("Yaz�l�m Geli�tirici Kamp� JAVA + REACT");
        
        UserManager userManager = new InstructorManager();
        UserManager userManager2 = new StudentManager();
        UserManager userManager3 = new UserManager();
        
        User[] users = {student, �nstructor};
        userManager.add(�nstructor);
        userManager2.add(student);
        userManager3.addMultiple(users);
        userManager.update(�nstructor);
        userManager.delete(�nstructor);
        userManager2.update(student);
        userManager2.delete(student);
        
        
	}

}
