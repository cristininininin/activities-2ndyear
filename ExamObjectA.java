class Student {
	String firstName;
	String lastName;
	int classYear;
	String major;

	public Student(String firstName, String lastName,int classYear, String major){
		this.firstName = firstName;
		this.lastName = lastName;
		this.classYear = classYear;
		this.major = major;
}

	public void displayStudent(){
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Class Year: " + classYear);
		System.out.println("Major: " + major);
		System.out.println("---------------------");
	}
}

public class ExamObjectA {
	public static void main (String [] args){

		Student student1 = new Student("Yvone", "Brace", 2025, "Tourism");
		Student student2 = new Student("Jolan", "Maghacot", 2025, "Architecture");

		student1.displayStudent();
		student2.displayStudent();
	}
}

