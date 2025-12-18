package Lab4_05;
import java.util.Scanner;
public class Color {
	private final int red;
	private final int green;
	private final int blue;

	public Color(int r , int g , int b) {
		if(r < 0) {
			this.red = 0;
		}else if(r > 255) {
			this.red = 255;
		}else {
			this.red = r;
		}
		if(g < 0) {
			this.green = 0;
		}else if(g > 255) {
			this.green = 255;
		}else {
			this.green = g;
		}
		if(b < 0) {
			this.blue = 0;
		}else if(b > 255) {
			this.blue = 255;
		}else {
			this.blue = b;
		}
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	public void displayInfo() {
		System.out.println("R = " + red + ", G = " + green + ", B = " + blue);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int g = input.nextInt();
		int b = input.nextInt();
		
		Color c = new Color(r , g, b);
		c.displayInfo();
		input.close();

	}

}
