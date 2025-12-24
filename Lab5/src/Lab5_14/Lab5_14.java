package Lab5_14;
import java.util.Scanner;

class Shipping {
	protected String trackingId;
	protected double baseFee;
	public Shipping(String trackingId , double baseFee) {
		this.trackingId = trackingId;
		this.baseFee = baseFee;
	}
	public double calculateTotalFee() {
		return baseFee;
	}
}

class StandardShipping extends Shipping {
	public StandardShipping(String trackingId , double baseFee) {
		super(trackingId , baseFee);
	}
	@Override
	public double calculateTotalFee() {
		return baseFee * 1.05;
	}
}

class PremiumShipping extends Shipping {
	protected double insuranceFee;
	public PremiumShipping(String trackingId , double baseFee ,  double insuranceFee) {
		super(trackingId , baseFee);
		this.insuranceFee = insuranceFee;
	}
	@Override
	public double calculateTotalFee() {
		super.calculateTotalFee();
		return insuranceFee = insuranceFee + baseFee;
	}
}

public class Lab5_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String stanId = input.nextLine();
		double stanBaseFee = input.nextDouble();
		String preId = input.nextLine();
		input.nextLine();
		double preBaseFee = input.nextDouble();
		double preInsuranceFee = input.nextDouble();
		
		Shipping sta = new StandardShipping(stanId , stanBaseFee);
		Shipping pre = new PremiumShipping(preId , preBaseFee , preInsuranceFee);
		Shipping[] s = {sta , pre};
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].calculateTotalFee());
		}
		input.close();
	}
}
