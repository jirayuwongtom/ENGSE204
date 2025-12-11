package Lab1;
import java.util.Scanner;
public class Lab1_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Enter number : ");
		
		x = input.nextInt();
		System.out.println("----------------" );
		
		int[]number = new int[x];
		for(int i = 0; i < x; i++) {
			number[i] = input.nextInt();
		}
		
		int max = number[0];
		
		for(int i = 0; i < x; i++) {
			if(number[i] > max) {
				max = number[i];
			}
		}
		
		System.out.println("Maxnumber : " + max);
		input.close();
	}
}
