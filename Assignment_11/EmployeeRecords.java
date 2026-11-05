class Employee {

	int employeeId;
	String name;
	String designation;
	double salary;

	Employee() {
		employeeId = 0;
		name = "Unknown";
		designation = "Not Assigned";
		salary = 0.0;
	}

	Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	Employee(Employee e) {
		employeeId = e.employeeId;
		name = e.name;
		designation = e.designation;
		salary = e.salary;
	}

	void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println();
	}
}

public class EmployeeRecords {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(101, "Rahul", "Developer", 50000);
		Employee e3 = new Employee(e2);

		System.out.println("Default Constructor:");
		e1.displayDetails();

		System.out.println("Parameterized Constructor:");
		e2.displayDetails();

		System.out.println("Copy Constructor:");
		e3.displayDetails();
	}
}
