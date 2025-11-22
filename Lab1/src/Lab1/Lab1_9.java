package Lab1;
import java.util.Scanner;
public class Lab1_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int sum = 0;
		System.out.print("Enter number : ");
		
		x = input.nextInt();
		System.out.println("----------------" );
		
		int[]number = new int[x];
		
		for(int i = 0; i < x; i++) {
			number[i] = input.nextInt();
			sum = sum + number[i];
		}
		double averageNumber = (double) sum /x;
		System.out.println("Averagenumber : " + averageNumber);
		input.close();
	}
}
