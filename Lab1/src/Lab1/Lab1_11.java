package Lab1;
import java.util.Scanner;
public class Lab1_11 {
	public static int sumArray(int[] number) {
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[]number = new int[N];
		for(int i = 0; i < N; i++) {
			number[i] = input.nextInt();
		}
		int resule = sumArray(number);
		System.out.println(resule);
		input.close();
	}
}
