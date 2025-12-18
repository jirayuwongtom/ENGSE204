package Lab5_02;
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
	public void makeSound() {
		System.out.println("I am an animal.");
	}
	
	public void displayInfo() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}

public class Lab5_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int age = input.nextInt();
		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.displayInfo();
		cat.makeSound();
		input.close();

	}

}
