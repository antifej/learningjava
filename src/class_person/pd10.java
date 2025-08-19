package class_person;

public class pd10 {
	public static void drawLine() {
		System.out.println("......................................");
	}
	
	   public static void main(String[] args) {
		Person person1 = new Person("Ingus", 24, true);
		Person person2 = new Person("Maris", 34, true);
		
		Student student1 = new Student("Laima", 19, true, "Daugavpils University", 150);
		Student student2 = new Student("Felix", 41, false, "RTU", 0);
		Student student3 = new Student("Kaspar", 27, false, "LU", 100);
		
		Worker worker1 = new Worker("Samanta", 34, false, "Maxima", 740.3);
		Worker worker2 = new Worker("Alex", 25, true, "MC+", 1000.4);
		Worker worker3 = new Worker("Milana", 21, true, "SIA Bite", 820.5);
		Worker worker4 = new Worker("Janis", 32, true, "SIA DDzKSU", 750);
		
		Person[] personList = {person1, person2, student1, student2, student3, worker1, worker2, worker3, worker4};
	
		drawLine();
		for(Person person: personList) {
			person.aboutPerson();
		}
		
		
		
		drawLine();
		   System.out.println("All students names");
		   for(Person person: personList) {
			   if(person instanceof Student) {
				   System.out.println(person.name);
				   
	}
			   
		   }
		   
		   drawLine();
		   double workerSalary = 0;
		   for(Person person: personList) {
			   if(person instanceof Worker) {
				   workerSalary += ((Worker) person).salary;
				   
			   }
		   }
		   System.out.println("All workers salary " + workerSalary);
		   
		   drawLine();
		   for(Person person: personList) {
			   if(person.isHappy) {
				   System.out.println(person.name);
			   }
		   }
		   drawLine();
		   for(Person person: personList) {
			   if(person instanceof Worker==false && person instanceof Student==false ) {
				   System.out.println(person.name);
			   }
		   }
		   
		   drawLine();
		   for(Person person: personList) {
			   if(person instanceof Worker) {
				  System.out.println(((Worker) person).companyName);
			   }
		   }
		   
	}
	  
	   
}
