package Lab1;
import java.util.Scanner ;
public class Lab1_3 {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		 x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		sc.close();
	}
}
