package Lab4_08;
import java.util.Scanner;
public class Movie {
	private String title;
	private String director;
	private double rating;
	
	public Movie(String title) {
		this(title , "Unknown");
	}
	
	public Movie(String title , String director) {
		this(title , director , 0.0);
	}
	
	public Movie(String title , String director , double rating) {
		this.title = title;
		this.director = director;
		
		if(rating > 10.0) {
			rating = 10.0;
		}
		if(rating < 0.0) {
			rating = 0.0;
		}
		this.rating = rating;
	}
	
	public void displayInfo() {
		System.out.println("Title : " + title + " , Director : " + director + " , Rating : " + rating);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode;
		mode = input.nextInt();
		input.nextLine();
		
		Movie m;
		if(mode == 1) {
			String title;
			title = input.nextLine();
			m = new Movie(title);
		}else if (mode == 2) {
			String title;
            String director;
            title = input.nextLine();
            director = input.nextLine();
            m = new Movie(title , director);
		}else if (mode == 3) {
			String title;
            String director;
            double rating;
            title = input.nextLine();
            director = input.nextLine();
            rating = input.nextDouble();
            m = new Movie(title , director , rating);
		}else {
			System.out.println("Invalid mode");
			return;
		}
		m.displayInfo();
		input.close();
	}

}
