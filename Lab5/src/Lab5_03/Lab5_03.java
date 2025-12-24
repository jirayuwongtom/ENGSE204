package Lab5_03;
import java.util.Scanner;

class Employee{
	protected double salary;
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateBonus() {
		return salary * 0.10;
	}
}

class Manager extends Employee {
	@Override
	public double calculateBonus() {
		return super.calculateBonus() + salary * 0.05;
	}
}

public class Lab5_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		input.nextLine();
		Manager m = new Manager();
		m.setSalary(salary);
		System.out.println(m.calculateBonus());
		input.close();
	}
}
