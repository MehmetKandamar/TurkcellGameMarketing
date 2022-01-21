package workshop3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(2,"Mehmet",  "Kandamar", "12345678910");
		Student student2 = new Student(5,"Berk", "Güngör", "12345678920");
		Student student3 = new Student(3,"Ziya", "Işık" , "12345678930");
		Student student4 = new Student(1,"Fatih", "Çakır" , "12345678930");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		
		Student studentX = new Student(1,"Yasemin",  "Yilmaz", "12529871237");
		
		System.out.println(studentManager.getAll().size());
		
		for (Student item : studentManager.students) {
            System.out.println(item.getId()+" "+item.getFirstName()+" "+item.getLastName()+" "+item.getIdentityNumber());
        }
		
		studentManager.delete(student1);
		studentManager.update(studentX);
		 for (Student item : studentManager.students) {
	            System.out.println(item.getId()+" "+item.getFirstName()+" "+item.getLastName()+" "+item.getIdentityNumber());
	        }
			System.out.println(studentManager.getAll().size());

	}

}
