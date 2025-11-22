package Lab1;
import java.util.Scanner;
public class Lab1_7 {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		System.out.println("----------------" );
		
		for (int i = 0; i < x; i++) {
			num = input.nextInt();
			sum = sum + num;
		}
		
		System.out.println("Sum :  " + sum);
		input.close();
	}

}
