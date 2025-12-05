package Lab3_07;
import java.util.Scanner;

public class Employee {
	private String employeeId;
	private String department;
	
	public Employee(String employeeId , String department) {
		this.employeeId = employeeId;
		this.department = department;
	}

	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id;
		String depart;
		String newdepart;
		
		id = input.nextLine();
		depart = input.nextLine();
		newdepart = input.nextLine();
		
		Employee e = new Employee(id , depart);
		
		e.setDepartment(newdepart);
		
		System.out.println(e.getEmployeeId());
		System.out.println(e.getDepartment());
		
		input.close();

	}

}
