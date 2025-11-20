package Lab1;
import java.util.Scanner;
public class Lab1_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Number = input.nextInt();
		int Result = 0;
		for(int i =1; i <= 12; i++) {
			Result = Number * i;
			System.out.println(Number + " x " + i + " = " + Result);
		}
		input.close();
	}
}
