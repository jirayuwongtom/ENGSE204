package Lab4_01;
import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	
	public Book(String title) {
		this.title = title;
		this.author = "Unknown";
	}
	
	public Book(String title , String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title : " + title + " , Author : " + author);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		
		Book b;
		if(mode == 1) {
			String title = input.nextLine();
			b = new Book(title);
		}else if (mode ==2) {
			String title = input.nextLine();
			String author = input.nextLine();
			b = new Book(title , author);
		}else {
			System.out.println("You can only choose 1 or 2");
			return;
		}
		b.displayInfo();
		input.close();
	}

}
