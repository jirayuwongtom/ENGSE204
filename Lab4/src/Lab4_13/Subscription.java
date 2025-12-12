package Lab4_13;
import java.util.Scanner;

public class Subscription {
	private final String planName;
	private final int durationDays;
	private static int maxDuration = 365;

	public Subscription(String planName , int durationDays) {
		this.planName = planName;
		if(durationDays > maxDuration) {
			this.durationDays = maxDuration;
		}else if(durationDays < 0) {
			this.durationDays = 0;
		}else
			this.durationDays = durationDays;
	}
	
	public Subscription(Subscription other) {
		this.planName = other.planName;
		this.durationDays = other.durationDays;
	}
	
	public static void setMaxDuration(int max) {
		if(max > 0) {
			maxDuration = max;
			System.out.println("Max duration set to " + max);
		}else {
			System.out.println("Invalid max policy");
		}
	}
	
	public Subscription extend(int days) {
		if(days <= 0) {
			System.out.println("Invalid extension days");
			return this;
		}
		
		int newDays = this.durationDays + days;
		
		if(newDays > maxDuration) {
			System.out.println("Extension failed : Exceeds max policy");
            return this;
		}
		System.out.println("Extension successful");
		return new Subscription(this.planName , newDays);
	}
	
	public void displayInfo() {
		System.out.println("Plan : " + planName + " , Days : " + durationDays);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		input.nextLine();
		
		Subscription.setMaxDuration(max);
		
		String plan = input.nextLine();
		int days = input.nextInt();
		int extend1 = input.nextInt();
		int extend2 = input.nextInt();
		
		Subscription s1 = new Subscription(plan , days);
		Subscription s2 = s1.extend(extend1);
		Subscription s3 = s2.extend(extend2);
		s3.displayInfo();
		input.close();
	}
}
