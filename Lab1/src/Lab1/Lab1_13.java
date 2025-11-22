package Lab1;

import java.util.Scanner;

public class Lab1_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("-----" );
		
		int grid[][] = new int[x][y];
		
		for (int i =0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				grid[i][j] = input.nextInt();
			}
		}
		
		int count = 0;
		for (int i =0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (grid[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println("Online : " + count);
		
		input.close();
	}
}

