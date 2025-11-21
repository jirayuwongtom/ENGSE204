package Lab1;
import java.util.Scanner;
public class Lab1_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		if (score >= 80 && score <= 100) {
			System.out.println("A");
		}
		else if (score >= 70 && score <= 79) {
			System.out.println("B");
		}
		else if (score >= 60 && score <= 69) {
			System.out.println("C");
		}
		else if (score >= 50 && score <= 59) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		input.close();
	}
}