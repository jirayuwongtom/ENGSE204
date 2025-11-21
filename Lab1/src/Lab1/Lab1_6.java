package Lab1;
import java.util.Scanner;
public class Lab1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =1; i <= 12; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}//end for
		sc.close();
	}//end main
}//end class
