package Lab1;
import java.util.Scanner ;
public class Lab1_3 {
	public static void main(String[] args) {
		int x;
		String y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		 x = input.nextInt();
		 
		if (x % 2 == 0) {
			y = "even number";
		} else {
			y = "odd number";
		}
		
		System.out.println(y);
		
		input.close();
	}
}
