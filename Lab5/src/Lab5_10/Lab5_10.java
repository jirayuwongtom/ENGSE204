package Lab5_10;
import java.util.Scanner;

class ProjectTask {
	protected String description;
	protected int baseHoues;
	public ProjectTask(String description , int baseHoues) {
		this.description = description;
		this.baseHoues = baseHoues;
	}
	public double calculateCost() {
		return baseHoues * 50.0;
	}
}

class ComplexTask extends ProjectTask {
	protected double setupFee;
	public ComplexTask(String description , int baseHoues , double setupFee) {
		super(description , baseHoues);
		this.setupFee = setupFee;
	}
	@Override
	public double calculateCost() {
		return (super.calculateCost() * 1.10) + setupFee;
	}
}

class SimpleTask extends ProjectTask {
	public SimpleTask(String description , int baseHoues) {
		super(description , baseHoues);
	}
	@Override
	public double calculateCost() {
		return super.calculateCost();
	}
}

public class Lab5_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String complexdes = input.nextLine();
		int complexHoues = input.nextInt();
		double complexFee = input.nextDouble();
		input.nextLine();
		String simpledes = input.nextLine();
		int simplHoues = input.nextInt();
		
		ProjectTask complex = new ComplexTask(complexdes , complexHoues , complexFee);
		ProjectTask simple = new SimpleTask(simpledes , simplHoues);
		ProjectTask[] p = {complex , simple};
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].calculateCost());
		}
		input.close();
	}

}
