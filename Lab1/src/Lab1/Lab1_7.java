package Lab1;
import java.util.Scanner;
public class Lab1_7 {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			num = input.nextInt();
			sum = sum + num;
		}
		
		System.out.println(sum);
		input.close();
	}

}
