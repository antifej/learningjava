package lessons_class_inheritance;

import class_workers.*;

//28. 06.2025.
public class Lesson44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker1 = new Worker("Alex",1800, "Builder");
		worker1.aboutWorker();
		worker1.doWork();
		
		double alexTax = worker1.getTax(2);
		System.out.println("Alex must pay " + alexTax );
		
		System.out.println("After tax, Alex will get " + worker1.NetoPay(alexTax));
		
		
		Programmer programmer1 = new Programmer("Māris",2500,new String[]{"C#", "Python", "Java"}, true);
		programmer1.aboutProgrammer();
		
		programmer1.doWork();
		//dependants =0
		double marisTax = programmer1.getTax(0);
		System.out.println("Māris must pay " + marisTax);
		System.out.println("Māris will get " + programmer1.NetoPay(marisTax));
		
		
		Doctor doctor1 = new Doctor("Felix", 3500, DoctorType.Dentist, "+371 26660278");
		doctor1.aboutDoctor();
		doctor1.doWork();
		System.out.println("Felix must pay " + doctor1.getTax(3));
		System.out.println("Felix will get sallary - " + doctor1.NetoPay(doctor1.getTax(0)));
	 
		
		
		
	}

}
