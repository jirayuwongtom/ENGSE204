package Lab1;
import java.util.Scanner;
public class Lab1_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r;
		int c;
		int targetR;
		int targetC;
		
		r = input.nextInt();
		c = input.nextInt();
		
		char[][]map = new char[r][c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				map[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.print("Enter target : ");
		targetR = input.nextInt();
		targetC = input.nextInt();
		
		if (map[targetR][targetC] == '*') {
			System.out.println("Mine");
		}
				
		
		input.close();
	}

}
