package Lab1;
import java.util.Scanner;
public class Lab1_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter score : ");
		int score = input.nextInt();
		
		if (score >= 80 ) {
			System.out.println("A");
		}
		else if (score >= 70) {
			System.out.println("B");
		}
		else if (score >= 60 ) {
			System.out.println("C");
		}
		else if (score >= 50 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		input.close();
	}
}