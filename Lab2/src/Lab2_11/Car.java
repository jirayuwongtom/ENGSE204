package Lab2_11;
import java.util.Scanner;

public class Car {
	private String model;
	private int year;
	
	public Car(String model , int year) {
		this.model = model;
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int newYear) {
		this.year = newYear;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int year;
		int newyear;
		
		name = input.nextLine();
		year = input.nextInt();
		newyear = input.nextInt();	
		
		Car c = new Car(name , year);
		c.setYear(newyear);
		System.out.println("Model : " + c.getModel());
		System.out.println("Year : " + c.getYear());
		
		input.close();
		

	}

}
