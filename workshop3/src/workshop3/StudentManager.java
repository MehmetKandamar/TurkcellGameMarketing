package workshop3;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public StudentManager() {
		
	}
	
	public void add(Student student) {
		for (Student studentx : students) {
			if (studentx.getIdentityNumber()==student.getIdentityNumber()) {
				System.out.println("This id number has been used before");
				return;
			}
		}
		this.students.add(student);
	}
	
	public void delete(Student student) {
		for (Student studentx : students) {
			if (studentx.getIdentityNumber()==student.getIdentityNumber()) {
				this.students.remove(student);
				System.out.println("There student which has : "+student.getIdentityNumber()+" identity number is deleted");
				return;
			}
		}
		System.out.println("There is no student which has : "+student.getIdentityNumber()+" identity number to delete");
	}
	
	public void update(Student student) {
		for (Student studentx : students) {
			if (studentx.getIdentityNumber()==student.getIdentityNumber()) {
				students.set(students.indexOf(student), studentx);
				System.out.println("The student which has : "+student.getIdentityNumber()+" identity number is updated");
				return;
			}
		}
		System.out.println("There is no student which has : "+student.getIdentityNumber()+" identity number to update");
	}
	public ArrayList<Student> getAll(){
		return this.students;
	
	}
	

}
