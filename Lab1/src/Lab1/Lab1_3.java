package Lab1;
import java.util.Scanner ;
public class Lab1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}//end if
		sc.close();
	}//end main function
}//end class
