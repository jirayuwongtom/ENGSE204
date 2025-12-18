package Lab1;
import java.util.Scanner;
public class Lab1_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r;
		int c;
		int targetR;
		int targetC;
		int count = 0;
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
			return;
		}
		
		int[]checkR = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[]checkC = {-1, 0, 1, -1, 1, -1, 0, 1};
		
		for(int x =0; x < 8; x++) {
			int cr = targetR + checkR[x];
			int cc = targetC + checkC[x];
			
			if(cc >= 0 && cc < r && cr >= 0 && cr < c) {
				if (map[cr][cc] == '*') {
					count ++;
				}
			}
		}
				
		System.out.print(count);
		input.close();
	}

}
