package Lab5_12;
import java.util.Scanner;

class Service {
	protected String name;
	protected double basePrice;
	public Service(String name , double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	public double calculateFinalPrice() {
		return basePrice;
	}
}

class BasicService extends Service {
	public BasicService(String name , double basePeice) {
		super(name , basePeice);
	}
	@Override
	public double calculateFinalPrice() {
		return basePrice * 1.05;
	}
}

class PremiumService extends Service {
	protected double premiumRate;
	public PremiumService(String name , double basePeice , double premiumRate) {
		super(name , basePeice);
		this.premiumRate = premiumRate;
	}
	@Override
	public double calculateFinalPrice() {
		return basePrice * (1 + premiumRate);
	}
}
	
public class Lab5_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String basicName = input.nextLine();
		double basicBasePrice = input.nextDouble();
		input.nextLine();
		String preName = input.nextLine();
		double preBasePrice = input.nextDouble();
		double preRate = input.nextDouble();
		
		Service b = new BasicService(basicName , basicBasePrice);
		Service p = new PremiumService(preName , preBasePrice , preRate);
		Service[] s = {b , p};
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].calculateFinalPrice());
		}
		input.close();
	}
}
