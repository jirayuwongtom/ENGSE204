package Lab2_3;
import java.util.Scanner;

public class Student {

	private String studentId;
	private String name;
	
	public static int studentCount = 0;
	
	public Student(String studentId , String name) {
		this.studentId = studentId;
		this.name = name;
		studentCount++;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String id;
		String name;
		n = input.nextInt();
		input.nextLine();
		
		
		for(int i = 0; i < n; i++) {
			id = input.nextLine();
			name = input.nextLine();
			
			Student stu = new Student(id , name);
		}
		System.out.println(Student.studentCount);
		
		input.close();
	}

}
