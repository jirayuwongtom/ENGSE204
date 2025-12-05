package Lab3_06;
import java.util.Scanner;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		if(initialBalance >= 0) {
			this.balance = initialBalance;
		}else {
			this.balance = 0;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit successful");
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			if(amount <= balance) {
				balance = balance - amount;
				System.out.println("Withdrawal successful");
			}else {
				 System.out.println("Insufficient funds");
			}
		}else {
			System.out.println("Invalid withdrawal amount");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double initial;
		double depositAmount;
		double withdrawAmount;
		
		initial = input.nextDouble();
		depositAmount = input.nextDouble();
		withdrawAmount = input.nextDouble();
		
		BankAccount b = new BankAccount(initial);
		
		b.deposit(depositAmount);
		b.withdraw(withdrawAmount);
		
		System.out.println("Final Balance : " + b.getBalance());
		
		input.close();
	}
}
