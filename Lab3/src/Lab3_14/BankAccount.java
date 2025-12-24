package Lab3_14;
import java.util.Scanner;

public class BankAccount {
	private double balance;
	private static int totalTransactionCount = 0;
	
	public BankAccount(double initialDeposit) {
		if(initialDeposit >= 0) {
			this.balance = initialDeposit;
		}else {
			this.balance = 0;
		}
		System.out.println("Account created");
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			totalTransactionCount++;
			 System.out.println("Deposit successful");
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			if(amount <= balance) {
				balance = balance - amount;
				totalTransactionCount++;
				System.out.println("Withdrawal successful");
			}else {
				System.out.println("Insufficient funds");
			}
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public static int getTotalTransactionCount() {
		return totalTransactionCount;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount myAccount = null;
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String command = input.nextLine();
			
			if(command.equals("CREATE")) {
				double init = input.nextDouble();
				input.nextLine();
				
				myAccount = new BankAccount(init);
			}
			else if(command.equals("DEPOSIT")) {
				double amount = input.nextDouble();
				input.nextLine();
				
				if(myAccount == null) {
					 System.out.println("No account exists");
                } else {
                    myAccount.deposit(amount);
				}
			}
			else if(command.equals("WITHDRAW")) {
				double amount = input.nextDouble();
				input.nextLine();
				
				if(myAccount == null) {
					 System.out.println("No account exists");
                } else {
                    myAccount.withdraw(amount);
				}
			}
			else if(command.equals("STATUS")) {
				if(myAccount == null) {
					System.out.println("No account exists");
				}else {
					System.out.println("Balance : " + myAccount.getBalance());
				}
			}
			else if(command.equals("GLOBAL_STATUS")){
				System.out.println("Total Transactions : " + BankAccount.getTotalTransactionCount());
			}
					
		}
		input.close();
	}

}
