package Lab3_04;
import java.util.Scanner;

public class Product {
	private String name;
	private static int productCount = 0;
	
	public Product(String name) {
		this.name = name;
		productCount++;
	}
	
	public String getName() {
		return name;
	}
	
	public static int getProductCount() {
		return productCount;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String productName;
		n = input.nextInt();
		
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			productName = input.nextLine();
			new Product(productName);
		}
		
		System.out.println(Product.getProductCount());
		input.close();

	}

}
