package Lab1;

import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double W = input.nextInt();
		double H = input.nextInt();
		double Area = W * H;
		System.out.println(Area);
		input.close();
	}

}
