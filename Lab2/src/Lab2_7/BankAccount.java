package Lab2_7;
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
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawal successful");
		} else {
			System.out.println("Insufficient funds");
		}
	}
	
	public void displayBalance() {
		System.out.println("Balance : " + balance);
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		double initial;
		double depositAmount;
		double withdraw1;
		double withdraw2;
		name = input.nextLine();
		initial = input.nextDouble();
		withdraw1 = input.nextDouble();
		withdraw2 = input.nextDouble();
		
		BankAccount bnk = new BankAccount(name , initial);
		
		bnk.withdraw(withdraw1);
		bnk.withdraw(withdraw2);
		bnk.displayBalance();
		
		input.close();
		
	}

}