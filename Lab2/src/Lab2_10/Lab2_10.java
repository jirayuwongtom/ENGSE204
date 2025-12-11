package Lab2_10;
import java.util.Scanner;


public class Lab2_10 {
	
	static class Product {
		String name;
		double price;
		
		public Product(String name , double price) {
			this.name = name;
			this.price = price;
		}
	}

	static class ShoppingCart {
		Product[] items = new Product[10];
		int itemCount = 0;
		
		public void addProduct(Product p) {
			items[itemCount] = p;
			itemCount++;
		}
		
		public double calculateTotalPrice() {
			double sum = 0.0;
			for (int i = 0; i <itemCount; i++) {
				sum = sum + items[i].price;
			}
			return sum;
		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String name;
		double price;
		n = input.nextInt();
		input.nextLine();
		
		ShoppingCart cart = new ShoppingCart();
		for (int i = 0; i < n; i++) {
			name = input.nextLine();
			price = input.nextDouble();
			input.nextLine();
			
			Product p = new Product(name , price);
			cart.addProduct(p);
		}
		
		System.out.println(cart.calculateTotalPrice());
		
		
		input.close();
	}

}
