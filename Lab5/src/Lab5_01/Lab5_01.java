package Lab5_01;

import java.util.Scanner;

class Animal {

	protected String name;
	protected int age;
	
	public void displayInfo() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

class Dog extends Animal {
	
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

public class Lab5_01 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			int age = input.nextInt();
			
			Dog dog = new Dog();
			
			dog.name = name;
			dog.age = age;
			dog.makeSound();
			dog.displayInfo();
			input.close();
		}
	}
