package Lab1;
import java.util.Scanner;
public class Lab1_6 {

	public static void main(String[] args) {
		Scanner intput = new Scanner(System.in);
		int a ;
		System.out.print("enter number ");
		a = intput.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(a + " x " + i + " = " + a * i);
		}
		
		intput.close();
	}
	
}
