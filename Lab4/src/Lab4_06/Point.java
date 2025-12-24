package Lab4_06;
import java.util.Scanner;
public class Point {
	private final int x;
	private final int y;
	
	public Point(int x , int y) {
		this.x = x;
		this.y =y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point move(int dx , int dy) {
		int newX = this.x + dx;
		int newY = this.y + dy;
		return new Point(newX , newY);
	}
	
	public void displayInfo() {
		System.out.println("(" + x + " , " + y + ")");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int dx = input.nextInt();
		int dy = input.nextInt();
		
		Point p1 = new Point(x , y);
		Point p2 = p1.move(dx, dy);
		Point p3 = p2.move(dx, dy);
		
		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
		input.close();
	}

}
