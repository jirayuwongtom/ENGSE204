package Lab2_1;
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
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String id = input.nextLine();
	    String name = input.nextLine();
	
	    Student stu = new Student();
	    stu.setStudentId(id);
	    stu.setName(name);
        
        System.out.println(stu.studentId);
        System.out.println(stu.name);

  
		input.close();
	}

}
