package Lab1;
import java.util.Scanner;
public class Lab1_2 {
	

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Width : ");
		 x = input.nextDouble();
		
		System.out.print("Enter Height : ");
		 y = input.nextDouble();
		z = x * y;
		System.out.printf("area = " + z);
		input.close();
	}
}
