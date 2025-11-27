package Lab1;
import java.util.Scanner;
public class Lab1_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		
		System.out.print("Enter number : ");
		
		x = input.nextInt();
		int[]id = new int[x];
		int[]stock = new int[x];
		System.out.println("----------------" );
		
		for (int i = 0; i < x; i++) {
			System.out.print("Enter ID : ");
			id[i] = input.nextInt();
			System.out.print("Enter Stock : ");
			stock[i] = input.nextInt();
		}
		
		boolean check = false;
		int search;
		System.out.println("----------------" );
		System.out.print("Enter Search ID : ");
		search = input.nextInt();
		
		for (int i = 0; i < x; i++) {
			if (id[i] == search) {
				System.out.println("Stock : " + stock[i]);
				check = true;
			}
		}
		
		if (check == false) {
			System.out.println("Product " + search + " not found");
		}
		
		input.close();
	}

}
