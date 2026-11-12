class Person {

	String name;
	int age;
	String email;

	Person(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	void displayPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
	}
}

class Student extends Person {

	int studentId;
	String course;

	Student(String name, int age, String email, int studentId, String course) {
		super(name, age, email);
		this.studentId = studentId;
		this.course = course;
	}

	void displayStudentDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Course: " + course);
	}
}

public class StudentInheritance {

	public static void main(String[] args) {
		Student s = new Student("Rahul Sharma", 20, "rahul@gmail.com", 101, "CSE");
		System.out.println("Personal Details:");
		s.displayPersonDetails();
		System.out.println("Academic Details:");
		s.displayStudentDetails();
	}
}
