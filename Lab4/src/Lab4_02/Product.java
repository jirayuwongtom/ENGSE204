package Lab4_02;
import java.util.Scanner;
public class Product {
	private String name;
	private double price;
	
	public Product(String name) {
		this(name , 0.0);
	}
	public Product(String name , double price) {
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product : " + name + ", Price : " + price);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		
		Product p;
		
		if(mode == 1) {
			String name = input.nextLine();
			p = new Product(name);
		}else if(mode == 2) {
			String name = input.nextLine();
			double price = input.nextDouble();
			p = new Product(name , price);
		}else {
			System.out.println("You can only choose 1 or 2");
			return;
		}
		p.displayInfo();
		input.close();
	}

}
