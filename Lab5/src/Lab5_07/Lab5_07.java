package Lab5_07;
import java.util.Scanner;

class Employee {
	protected String name;
	protected double baseSalary;
	public Employee(String name , double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double calculatePay() {
		return baseSalary;
	}
}

class SalesEmployee extends Employee {
	protected double commissionRate;
	public SalesEmployee(String name , double baseSalary , double commissionRate) {
		super(name , baseSalary);
		this.commissionRate = commissionRate;
	}
	@Override
	public double calculatePay() {
		return baseSalary + (baseSalary * commissionRate);
	}
}

class Manager extends Employee {
	protected double fixedBouns;
	public Manager(String name , double baseSalary , double fixedBouns) {
		super(name , baseSalary);
		this.fixedBouns = fixedBouns;
	}
	@Override
	public double calculatePay() {
		return baseSalary + fixedBouns;
	}
}

class PayrollProcessor {
	public static void process(Employee e) {
		System.out.println(e.name + " total pay : " + e.calculatePay());
	}
}

public class Lab5_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String salesName = input.nextLine();
		double salesSalary = input.nextDouble();
		double rate = input.nextDouble();
		input.nextLine();
		String managerName = input.nextLine();
		double managerSalary = input.nextDouble();
		double bonus = input.nextDouble();
		
		Employee sales = new SalesEmployee(salesName , salesSalary , rate);
		Employee manager = new Manager(managerName , managerSalary , bonus);
		PayrollProcessor.process(sales);
		PayrollProcessor.process(manager);
		input.close();
	}
}
