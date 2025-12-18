package Lab4_04;
import java.util.Scanner;
public class Location {
	private double latitude;
	private double longitude;
	
	public Location(double latitude , double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Location(Location other) {
		this.latitude = other.latitude;
		this.longitude = other.longitude;
	}
	
	public void setLatitude(double newLat) {
		this.latitude = newLat;
	}
	
	public void displayInfo() {
		System.out.println("Lat: " + latitude + ", Lon: " + longitude);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double lat = input.nextDouble();
		double lon = input.nextDouble();
		double newlat = input.nextDouble();
		
		Location loc1 = new Location(lat , lon);
		Location loc2 = new Location(loc1);
		
		loc1.setLatitude(newlat);
		loc1.displayInfo();
		loc2.displayInfo();
		input.close();
	}
}
