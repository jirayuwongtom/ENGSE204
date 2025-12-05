package Lab3_08;
import java.util.Scanner;

public class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
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
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0) {
            if (amount <= stock) {
                stock -= amount;
                System.out.println("Sale successful");
            } else {
                System.out.println("Not enough stock");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int initialStock = input.nextInt();
        int n = input.nextInt();
        input.nextLine(); // clear buffer

        InventoryItem item = new InventoryItem(name, initialStock);

        for (int i = 0; i < n; i++) {
            String command = input.nextLine().trim();
            int amount = input.nextInt();
            input.nextLine();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock : " + item.getStock());
        input.close();
    }
}
