package Lab1;
import java.util.Scanner;
public class Lab1_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		int num = 0;
		
		for (int i = 0; i < n; i++) {
			num = input.nextInt();
			sum = sum + num;
		}
		
		System.out.println(sum);
		input.close();
	}

}
