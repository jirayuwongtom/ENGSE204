package Lab2_5;
import java.util.Scanner;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width , double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w;
		double h;
		System.out.print("Enter Width : ");
		w = input.nextDouble();
		
		System.out.print("Enter Height : ");
		h = input.nextDouble();
		
		Rectangle rec = new Rectangle(w , h);
		
		System.out.println("Area : " + rec.getArea());
		System.out.println("Perimeter : " + rec.getPerimeter());
		
		
		input.close();

	}

}
