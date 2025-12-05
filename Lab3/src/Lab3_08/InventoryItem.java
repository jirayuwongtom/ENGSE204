package Lab3_08;
import java.util.Scanner;

public class InventoryItem {
	private String productName;
	private int stock;
	
	public InventoryItem(String productName , int initalStock) {
		this.productName = productName;
		if(initalStock >= 0) {
			this.stock = initalStock;
		}else {
			this.stock = 0;
		}
	}

	public String getProductName() {
		return productName;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void addStock(int amount) {
		if(amount > 0) {
			stock = stock + amount;
			System.out.println("Stock added");
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void sellStock(int amount) {
		if(amount > 0) {
			if(amount <= stock) {
				stock = stock - amount;
				 System.out.println("Sale successful");
			}else {
				System.out.println("Not enough stock");
			}
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int initalStock;
		
		name = input.nextLine();
		initalStock = input.nextInt();
		
		InventoryItem ii = new InventoryItem(name , initalStock);
		
		int n;
		n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String commamd;
			int amount;
			
			commamd = input.nextLine().trim();
			amount = input.nextInt();
			input.nextLine();
			
			if(commamd.equals("ADD")) {
				ii.addStock(amount);
			}else if (commamd.equals("SELL")) {
				ii.sellStock(amount);
			}
		}
		
		System.out.println("Final Stock : " + ii.getStock());
		
		input.close();

	}

}
