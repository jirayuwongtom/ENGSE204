package Lab1;
import java.util.Scanner;
public class Lab1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Width : ");
		double w = input.nextDouble();
		System.out.print("Enter Height : ");
		double h = input.nextDouble();
		System.out.println("Area = " + (w * h));
		input.close();
	}//end main function
}//end class
