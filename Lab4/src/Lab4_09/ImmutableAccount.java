package Lab4_09;
import java.util.Scanner;
public class ImmutableAccount {
	 private final String accountId;
	 private final double balance;
	 
	 public ImmutableAccount(String accountId , double balance) {
		 this.accountId = accountId;
		 if(balance < 0) {
			 this.balance = 0.0;
		 }else {
			 this.balance = balance;
		 }
	 }
	 
	 public ImmutableAccount(ImmutableAccount other) {
		 this.accountId = other.accountId;
		 this.balance = other.balance;
	 }

	 public String getAccountId() {
		 return accountId;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 public ImmutableAccount deposit(double amount) {
		 if(amount > 0) {
			 return new ImmutableAccount(this.accountId , this.balance + amount);
		 }else {
			 System.out.println("Invalid deposit amount");
			 return this;
		 }
	 }
	 
	 public ImmutableAccount withdraw(double amount) {
		 if(amount > this.balance) {
			 System.out.println("Insufficient funds.");
			 return this;
		 }
		 if(amount <= 0) {
			 System.out.println("Invalid withdrawal amount.");
	         return this;
		 }
		 return new ImmutableAccount(this.accountId , this.balance - amount);
	 }
	 
	 public void displayInfo() {
		 System.out.println("ID : " + accountId + ", Balance : " + balance);
	 }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		double balance = input.nextDouble();
		double depositAmount = input.nextDouble();
		double withdrawAmount = input.nextDouble();
		
		ImmutableAccount acc1 = new ImmutableAccount(id , balance);
		ImmutableAccount acc2 = acc1.deposit(depositAmount);
		ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);
		
		acc1.displayInfo();
		acc3.displayInfo();
		input.close();
	}

}
