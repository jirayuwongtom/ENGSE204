package Lab1;
import java.util.Scanner;
public class Lab1_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[]number = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			number[i] = input.nextInt();
			sum += number[i];
		}
		double averageNumber = sum / N;
		System.out.println(averageNumber);
		input.close();
	}
}
