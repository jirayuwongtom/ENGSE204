package Lab1;
import java.util.Scanner;
public class Lab1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1 = Americano");
		System.out.println("2 = Latte");
		System.out.println("3 = Espresso");
		System.out.println("4 = Mocha");
		System.out.print("Enter menu :  ");
		int num = input.nextInt();
		
		String menu;
		if (num == 1) {
			menu = "Americano";
		} else if (num == 2) {
			menu = "Latte";
		} else if (num == 3) {
			menu = "Espresso";
		} else if (num == 4) {
			menu = "Mocha";
		} else {
			menu = "Invalid Menu";
		}
		
		System.out.printf(menu);
		
		input.close();
	}
	
}
