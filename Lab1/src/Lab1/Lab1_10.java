package Lab1;
import java.util.Scanner;
public class Lab1_10 {
	public static double calculateArea(double width , double height) {
		return width * height;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width = input.nextDouble();
		double height = input.nextDouble();
		double area = calculateArea(width , height);
		System.out.println(area);
		input.close();
	}

}
