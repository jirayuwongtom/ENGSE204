package Lab5_08;
import java.util.Scanner;

class Person { 
	protected String name;
	public Person(String name) {
		this.name = name;
	}
	public String getStatus() {
		return "Person : " + name;
	}
}

class Student extends Person {
	protected int studentId;
	public Student(String name , int studentId) {
		super(name);
		this.studentId = studentId;
	}
	@Override
	public String getStatus() {
		return "Student : " + name + " , ID : " + studentId;
	}
}

class Employee extends Person {
	protected double salary;
	public Employee(String name , double salary) {
		super(name);
		this.salary = salary;
	}
	public void applyBonus(double bonus) {
		salary = salary + bonus;
	}
	@Override
	public String getStatus() {
		return "Employee : " + name + " , Salary : " + salary;
	}
}

public class Lab5_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String studentName = input.nextLine();
		int studentId = input.nextInt();
		input.nextLine();
		String employeeName = input.nextLine();
		double salary = input.nextDouble();
		
		Person s = new Student(studentName , studentId);
		Person emp = new Employee(employeeName , salary);
		Person[] p = {s , emp};
		
		for(int i = 0; i < p.length; i++) {
			if(p[i] instanceof Employee) {
				Employee e = (Employee) p[i];
				e.applyBonus(1000.0);
			}
		}
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getStatus());
		}
		input.close();
	}
}
