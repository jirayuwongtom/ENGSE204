package Lab1;
import java.util.Scanner;
public class Lab1_11 {
	public static int sumArray(int[] number) {
		int x = 0;
		for(int i = 0; i < number.length; i++) {
			x = x + number[i];
		}
		return x;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int sum;
		System.out.print("Enter number : ");
		
		x = input.nextInt();
		System.out.println("----------------" );
		
		int[]number = new int[x];
		
		for(int i = 0; i < x; i++) {
			number[i] = input.nextInt();
		}
		
		sum = sumArray(number);
		
		System.out.println("Sum : " + sum);
		input.close();
	}
}
