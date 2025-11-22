package Lab1;
import java.util.Scanner;
public class Lab1_2 {
	

	public static void main(String[] args) {
		double w;
		double h;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Width : ");
		 w = input.nextDouble();
		
		System.out.print("Enter Height : ");
		 h = input.nextDouble();
		
		System.out.printf("Area = %.2f" , w * h);
		input.close();
	}
}
