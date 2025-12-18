package Lab5_09;
import java.util.Scanner;

class Item {
	protected String name;
	public Item(String name) {
		this.name = name;
	}
	public double getValue() {
		return 0.0;
	}
}

class PhysicalProduct extends Item {
	protected double unitPrice;
	protected int quantity;
	public PhysicalProduct(String name , double unitPrice , int quantity) {
		super(name);
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	@Override
	public double getValue() {
		return unitPrice * quantity;
	}
}

class DigitalSubscription extends Item {
	protected double monthlyCost;
	protected int months;
	public DigitalSubscription(String name, double monthlyCost, int months) {
		super(name);
		this.monthlyCost = monthlyCost;
		this.months = months;
	}
	@Override
	public double getValue() {
		return monthlyCost * months;
	}
}

public class Lab5_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String physicalName = input.nextLine();
		double unitPrice = input.nextDouble();
		int quantity = input.nextInt();
		input.nextLine();
		String digitalName = input.nextLine();
		double monthlyCost = input.nextDouble();
		int months = input.nextInt();
		
		Item p = new PhysicalProduct(physicalName , unitPrice , quantity);
		Item d = new DigitalSubscription(digitalName , monthlyCost , months);
		Item[] item = {p , d};
		
		double total = 0.0;
		for(int i = 0; i < item.length; i++) {
			total = total + item[i].getValue();
		}
		System.out.println(total);
		input.close();
	}
}
