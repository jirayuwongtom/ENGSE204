package Lab1;
import java.util.Scanner;
public class Lab1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menuNumber = input.nextInt();
		if(menuNumber == 1) {
			System.out.println("Americano");
		}else if(menuNumber == 2) {
			System.out.println("Latte");
		}else if(menuNumber == 3) {
			System.out.println("Espresso");
		}else if(menuNumber == 4) {
			System.out.println("Mocha");
		}else {
			System.out.println("Invalid Menu");
		}
		input.close();
	}
}
