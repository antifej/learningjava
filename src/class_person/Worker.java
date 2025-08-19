package class_person;

public class Worker extends Person {
	public String companyName;
	public double salary;
	
	public Worker(String name, int age, boolean isHappy, String companyName, double salary) {
		super(name, age, isHappy);
		
		this.companyName = companyName;
		this.salary = salary;
		
	}
	
	public void aboutWorker() {
		super.aboutPerson();
		System.out.println("Company name" + this.companyName + "Salary" + this.salary);
	}

}
