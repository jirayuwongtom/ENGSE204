package Lab2_12;
import java.util.Scanner;

public class Lab2_12 {
	
	static class Coures {
		String courseId;
		String courseName;
		
		public Coures(String courseId , String courseName) {
			this.courseId = courseId;
			this.courseName = courseName;
		}
		
		public String getCourseInfo() {
			 return courseId + " : " + courseName;
		}
	}
	
	static class Student {
		private String studentName;
		private Coures enrolledCourse;
		
		public Student(String studentName , Coures enrolledCourse) {
			this.studentName = studentName;
			this.enrolledCourse = enrolledCourse;
		}
		
		public void displayEnroolment() {
			System.out.println("Student : " + studentName);
			System.out.println("Enrooled in : " + enrolledCourse.getCourseInfo());
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id;
		String nameCourse;
		String nameStudent;
		
		id = input.nextLine();
		nameCourse = input.nextLine();
		nameStudent = input.nextLine();
		
		Coures c = new Coures(id , nameCourse);
		Student s = new Student(nameStudent , c);
		
		s.displayEnroolment();
		
		input.close();
	}

}
