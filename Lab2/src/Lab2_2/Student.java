package Lab2_2;
import java.util.Scanner;

public class Student {

	private String studentId;
	private String name;

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	 public void setName(String name) {
	        this.name = name;
	 }
	
	 public void displayInfo() {
		 System.out.println(studentId);
	     System.out.println(name);
	 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String id = input.nextLine();
	    String name = input.nextLine();
	
	    Student stu = new Student();
	    stu.setStudentId(id);
	    stu.setName(name);
	    
	    stu.displayInfo();
   
		input.close();
	}

}
