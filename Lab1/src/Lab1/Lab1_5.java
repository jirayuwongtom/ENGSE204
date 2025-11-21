package Lab1;
import java.util.Scanner;
public class Lab1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter menu :  ");
		int num = input.nextInt();
		
		if (num == 1) {
			System.out.print("Americano");
		} else if (num == 2) {
			System.out.print("Latte");
		} else if (num == 3) {
			System.out.print("Espresso");
		} else if (num == 4) {
			System.out.print("Mocha");
		} else {
			System.out.print("Invalid Menu");
		}
		
		input.close();
	}
	
}
