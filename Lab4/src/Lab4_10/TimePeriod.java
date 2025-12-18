package Lab4_10;
import java.util.Scanner;
public class TimePeriod {
	private int startHour;
	private int endHour;
	
	public TimePeriod() {
		this(9 , 17);
	}

	public TimePeriod(int startHour , int endHour) {
		if(startHour < 0) {
			startHour = 0;
		}
		if(startHour > 23) {
			startHour = 23;
		}
		if(endHour < 0) {
			endHour = 0;
		}
		if(endHour > 23) {
			endHour = 23;
		}
		if(startHour > endHour) {
			int swap = startHour;
			startHour = endHour;
			endHour = swap;
		}
		this.startHour = startHour;
        this.endHour = endHour;
	}
	
	public void displayInfo() {
		System.out.println(startHour + ":00 - " + endHour + ":00");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		
		TimePeriod t;
		
		if(mode == 1) {
			t = new TimePeriod();
		}else if(mode == 2) {
			int startHour = input.nextInt();
			int endHour = input.nextInt();
			t = new TimePeriod(startHour, endHour);
		}else {
			System.out.println("You can only choose 1 or 2");
			return;
		}
		t.displayInfo();
		input.close();
	}

}
