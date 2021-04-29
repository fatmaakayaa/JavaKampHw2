package javaKampHw2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("Fatma");
        student.setLastName("Kaya");
        student.seteMail("frukiyekayaa@gmail.com");
        student.setCoursesApplied("Yazılım Gelişirici Kampı JAVA + REACT ");
        
        Instructor ınstructor = new Instructor();
        ınstructor.setId(2);
        ınstructor.setFirstName("Engin");
        ınstructor.setLastName("Demiroğ");
        ınstructor.seteMail("engindemirog@gmail.com");
        ınstructor.setCoursesInstructor("Yazılım Geliştirici Kampı JAVA + REACT");
        
        UserManager userManager = new InstructorManager();
        UserManager userManager2 = new StudentManager();
        UserManager userManager3 = new UserManager();
        
        User[] users = {student, ınstructor};
        userManager.add(ınstructor);
        userManager2.add(student);
        userManager3.addMultiple(users);
        userManager.update(ınstructor);
        userManager.delete(ınstructor);
        userManager2.update(student);
        userManager2.delete(student);
        
        
	}

}
