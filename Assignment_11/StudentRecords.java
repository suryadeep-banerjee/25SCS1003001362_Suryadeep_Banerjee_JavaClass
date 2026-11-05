class Student {

	int studentId;
	String studentName;
	String course;
	int age;

	Student() {
		studentId = 0;
		studentName = "Unknown";
		course = "Not Assigned";
		age = 0;
	}

	Student(int studentId, String studentName, String course, int age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.age = age;
	}

	void displayDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Course: " + course);
		System.out.println("Age: " + age);
		System.out.println();
	}
}

public class StudentRecords {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "Rahul Sharma", "CSE", 20);

		System.out.println("Default Constructor:");
		s1.displayDetails();

		System.out.println("Parameterized Constructor:");
		s2.displayDetails();
	}
}
