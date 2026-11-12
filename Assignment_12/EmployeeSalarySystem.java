abstract class Employee {

	int employeeId;
	String employeeName;

	Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

	double monthlySalary;

	FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
		super(employeeId, employeeName);
		this.monthlySalary = monthlySalary;
	}

	double calculateSalary() {
		return monthlySalary;
	}
}

class PartTimeEmployee extends Employee {

	int hoursWorked;
	double paymentPerHour;

	PartTimeEmployee(int employeeId, String employeeName, int hoursWorked, double paymentPerHour) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.paymentPerHour = paymentPerHour;
	}

	double calculateSalary() {
		return hoursWorked * paymentPerHour;
	}
}

public class EmployeeSalarySystem {

	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee(101, "Rahul Sharma", 50000);
		Employee e2 = new PartTimeEmployee(102, "Amit Kumar", 80, 500);
		System.out.println("Full-Time Employee:");
		System.out.println("Employee ID: " + e1.employeeId);
		System.out.println("Employee Name: " + e1.employeeName);
		System.out.println("Salary: " + e1.calculateSalary());
		System.out.println();
		System.out.println("Part-Time Employee:");
		System.out.println("Employee ID: " + e2.employeeId);
		System.out.println("Employee Name: " + e2.employeeName);
		System.out.println("Salary: " + e2.calculateSalary());
	}
}
