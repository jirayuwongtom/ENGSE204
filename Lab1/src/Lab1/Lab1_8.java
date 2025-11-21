package Lab1;
import java.util.Scanner;
public class Lab1_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[]number = new int[N];
		for(int i = 0; i < N; i++) {
			number[i] = input.nextInt();
		}
		int maxNumber = number[0];
		for(int i = 0; i < N; i++) {
			if(number[i] > maxNumber) {
				maxNumber = number[i];
			}
		}
		System.out.println(maxNumber);
		input.close();
	}
}
