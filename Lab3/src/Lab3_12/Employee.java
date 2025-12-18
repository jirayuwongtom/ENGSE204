package Lab3_12;
import java.util.Scanner;

public class Employee {
	private String name;
	private double monthlySalary;
	
	public Employee(String name , double monthlySalary) {
		this.name = name;

		if(monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}else {
			this.monthlySalary = 0;
		}
	}

	public String getName() {
		return name;
	}
	
	public void giveRaise(double amount) {
		if(amount > 0) {
			monthlySalary = monthlySalary + amount;
			System.out.println("Raise applied");
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	private double getAnnualSalary() {
		return monthlySalary * 12;
	}
	
	public double calculateTax(double taxRate) {
		return getAnnualSalary() * taxRate;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		double monthlySaraly = input.nextDouble();
		double taxRate = input.nextDouble();
		double raiseAmount = input.nextDouble();
		
		Employee emp = new Employee(name , monthlySaraly);
		System.out.println("Tax (Before) : " + emp.calculateTax(taxRate));
		
		emp.giveRaise(raiseAmount);
		System.out.println("Tax (After) : " + emp.calculateTax(taxRate));
		
		input.close();
	}

}
