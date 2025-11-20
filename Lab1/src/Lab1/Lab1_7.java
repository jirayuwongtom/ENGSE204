package Lab1;
import java.util.Scanner;
public class Lab1_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int number = input.nextInt();
			sum += number;
		}
		System.out.println(sum);
		input.close();
	}

}
