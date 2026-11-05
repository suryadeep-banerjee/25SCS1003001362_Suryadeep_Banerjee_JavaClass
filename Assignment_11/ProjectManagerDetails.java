class CompanyEmployee {

	int employeeId;
	String employeeName;
	double basicSalary;

	CompanyEmployee(int employeeId, String employeeName, double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
}

class Manager extends CompanyEmployee {

	String department;
	int teamSize;

	Manager(int employeeId, String employeeName, double basicSalary, String department, int teamSize) {
		super(employeeId, employeeName, basicSalary);
		this.department = department;
		this.teamSize = teamSize;
	}
}

class ProjectManager extends Manager {

	String projectName;
	int projectDuration;

	ProjectManager(
		int employeeId,
		String employeeName,
		double basicSalary,
		String department,
		int teamSize,
		String projectName,
		int projectDuration
	) {
		super(employeeId, employeeName, basicSalary, department, teamSize);
		this.projectName = projectName;
		this.projectDuration = projectDuration;
	}

	void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Department: " + department);
		System.out.println("Team Size: " + teamSize);
		System.out.println("Project Name: " + projectName);
		System.out.println("Project Duration: " + projectDuration + " months");
	}
}

public class ProjectManagerDetails {

	public static void main(String[] args) {
		ProjectManager pm = new ProjectManager(101, "Rahul Sharma", 60000, "IT", 10, "Cloud Management System", 12);

		System.out.println("Project Manager Details:");
		pm.displayDetails();
	}
}
