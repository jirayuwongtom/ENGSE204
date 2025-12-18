package Lab5_04;
import java.util.Scanner;

class Vehicle {
	protected String color;
	
	public Vehicle(String color) {
		this.color = color;
	}
}

class Car extends Vehicle{
	protected int wheels;
	
	public Car(String color , int wheels) {
		super(color);
		this.wheels = wheels;
	}
	
	public void displayDetails() {
		System.out.println("Color : " + color + ", Wheels : " + wheels);
	}
}

public class Lab5_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String color = input.nextLine();
		int wheels = input.nextInt();
		Car c = new Car(color , wheels);
		c.displayDetails();
		input.close();
	}
}
