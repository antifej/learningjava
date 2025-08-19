package class_person;

public class Student extends Person {
	public String university;
	public int stipendy;
	
	public Student(String name, int age, boolean isHappy, String university, int stipendy) {
		super(name, age, isHappy);
		
		this.university = university;
		this.stipendy = stipendy;
	
	}
	
	public void aboutStudent() {
		super.aboutPerson();
		System.out.println("Company name" + this.university + "Stipendy" + this.stipendy);
		
	}

}
