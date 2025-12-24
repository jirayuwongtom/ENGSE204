package Lab5_15;
import java.util.Scanner;

class RentalVehicle {
	protected String model;
	protected double rentalRate;
	public RentalVehicle(String model , double rentalRate) {
		this.model = model;
		this.rentalRate = rentalRate;
	}
	public double calculateFee() {
		return rentalRate;
	}
}

class Car extends RentalVehicle {
	public Car(String model , double rentalRate) {
		super(model , rentalRate);
	}
	@Override
	public double calculateFee() {
		return rentalRate + 100.0;
	}
}

class Motorcycle extends RentalVehicle {
	public Motorcycle(String model , double rentalRate) {
		super(model , rentalRate);
	}
	@Override
	public double calculateFee() {
		return rentalRate * 1.10;
	}
}

public class Lab5_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String carModel = input.nextLine();
		double carRentalRate = input.nextDouble();
		input.nextLine();
		String motoModel = input.nextLine();
		double motoRentalRate = input.nextDouble();
		
		RentalVehicle c = new Car(carModel , carRentalRate);
		RentalVehicle m = new Motorcycle(motoModel , motoRentalRate);
		RentalVehicle[] r = {c , m};
		
		double totalRentalFee = 0.0;
		for(int i = 0; i < r.length; i++) {
			totalRentalFee = totalRentalFee + r[i].calculateFee();
		}
		System.out.println(totalRentalFee);
		input.close();
	}
}
