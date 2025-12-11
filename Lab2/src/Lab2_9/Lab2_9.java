package Lab2_9;
import java.util.Scanner;

public class Lab2_9 {
	
	static class Address {
		private String street;
		private String city;
		private String zipCode;
	
		public Address(String street , String city , String zipCode) {
			this.street = street;
			this.city = city;
			this.zipCode = zipCode;
		
		}
	
		public String getFullAddress() {
			return street + ", " + city + ", " + zipCode;
		}
	}
	
	static class Student {
		private String name;
		private Address address;
		
		public Student(String name , Address address) {
			this.name = name;
			this.address = address;
		
		}
	
		public void displayProfile() {
			System.out.println("Name : " + name);
			System.out.println("Address : " + address.getFullAddress());
		}
	
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String street;
		String city;
		String zipcode;
		
		name = input.nextLine();
		street = input.nextLine();
		city = input.nextLine();
		zipcode = input.nextLine();
		
		Address adds = new Address(street , city , zipcode);
		Student stu = new Student(name , adds);
		
		stu.displayProfile();
		
		input.close();
		
	}

}
