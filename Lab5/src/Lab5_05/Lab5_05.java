package Lab5_05;
import java.util.Scanner;

class Shape {
	protected String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	protected double radius;
	
	public Circle(String name , double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return 3.14159 * radius * radius;
	}
}

class Rectangle extends Shape{
	protected double width;
	protected double height;
	
	public Rectangle(String name , double width , double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}
public class Lab5_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double width = input.nextDouble();
		double height = input.nextDouble();
		input.nextLine();
		Shape circle = new Circle("Circle" , radius);
		Shape rectangle = new Rectangle("Rectangle" , width , height);
		Shape[] s = {circle , rectangle};
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].calculateArea());
		}
		input.close();
	}
}
