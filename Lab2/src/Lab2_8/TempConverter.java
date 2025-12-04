package Lab2_8;
import java.util.Scanner;

public class TempConverter {

	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mode;
		double temp;
		mode = input.nextLine();
		temp = input.nextDouble();
		
		if (mode.equals("C_TO_F")) {
			System.out.println(TempConverter.celsiusToFahrenheit(temp));
		} else if (mode.equals("F_TO_C")) {
			System.out.println(TempConverter.fahrenheitToCelsius(temp));
		}
		
		
		input.close();
		

	}

}
