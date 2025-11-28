package Lab2_6;
import java.util.Scanner;

public class BankAccount {
	private String ownerName;
	private double balance;
	
	public BankAccount(String ownerName , double initialBalance) {
		this.ownerName = ownerName;
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void displaySummary() {
		System.out.println("Owner : " + ownerName);
		System.out.println("Balance : " + balance);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		double initial;
		double depositAmount;
		name = input.nextLine();
		initial = input.nextDouble();
		depositAmount = input.nextDouble();
		
		BankAccount bnk = new BankAccount(name , initial);
		
		bnk.deposit(depositAmount);
		bnk.displaySummary();
		
		input.close();
		
	}

}
