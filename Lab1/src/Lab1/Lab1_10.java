package Lab1;
import java.util.Scanner;
public class Lab1_10 {
	public static double calculateArea(double width , double height) {
		double result = width * height;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		System.out.print("Enter Width : ");
		x = input.nextDouble();
		
		System.out.print("Enter Height : ");
		y = input.nextDouble();
		
		double area = calculateArea(x , y);
		System.out.printf("area = " + area);
		input.close();
	}

}
