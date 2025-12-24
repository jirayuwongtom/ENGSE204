package Lab5_01;

import java.util.Scanner;

class Animal {

	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
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
			dog.setName(name);
			dog.setAge(age);
			dog.makeSound();
			dog.displayInfo();
			input.close();
		}
	}
