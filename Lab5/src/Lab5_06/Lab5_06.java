package Lab5_06;
import java.util.Scanner;

class Media {
	protected String title;
	public Media(String title) {
		this.title = title;
	}
	public void process() {
		System.out.println("Starting generic media processing.");
	}
}

class Video extends Media {
	protected int duration;
	public Video(String title , int duration) {
		super(title);
		this.duration = duration;
	}
	@Override
	public void process() {
		System.out.println("Processing video : " + title + " for " + duration + " minutes.");
	}
}

class Audio extends Media {
	protected String quality;
	public Audio(String title , String quality) {
		super(title);
		this.quality = quality;
	}
	@Override
	public void process() {
		System.out.println("Processing audio : " + title + " with " + quality + " quality.");
	}
}

class Processor {
	public static void runProcessor(Media m) {
		m.process();
	}
}
public class Lab5_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String videoTitle = input.nextLine();
		int duration = input.nextInt();
		input.nextLine();
		String audioTitle = input.nextLine();
		String quality = input.nextLine();
		
		Media video = new Video(videoTitle , duration);
		Media audio = new Audio(audioTitle , quality);
		
		Processor.runProcessor(video);
		Processor.runProcessor(audio);
		input.close();
	}
}
