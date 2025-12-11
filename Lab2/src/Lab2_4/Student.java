package Lab2_4;
import java.util.Scanner;

public class Student {
	private String name;
	private int midtermScore;
	private int finalScore;
	
	public Student(String name , int midtermScore , int finalScore) {
		this.name = name;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
	}
	public double calculateAverage() {
		return (midtermScore + finalScore) / 2.0;
	}

	public void displaySummary() {
		double average;
		average = calculateAverage();
		System.out.println("Name : " + name);
		System.out.println("Average Score : " + average);
		
		if (average > 50) {
			System.out.println("Status : Pass");
		}else {
			System.out.println("Status : Fail");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int midScore;
		int finalScore;
		
		name = input.nextLine();
		midScore = input.nextInt();
		finalScore = input.nextInt();
		
		Student stu = new Student(name , midScore , finalScore);
		stu.displaySummary();
		
		input.close();

	}

}
