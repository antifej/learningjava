package lessons_class_inheritance;
import class_workers.*;
public class Lesson45 {
	public static void drawLine() {
		System.out.println("......................................");
	}

	public static void main(String[] args) {
		//3 workers
		Worker worker1 = new Worker("Label", 800, "Hesburger Burger Cook");
		Worker worker2 = new Worker("Kaspar", 50, "Bottle Collector");
		Worker worker3 = new Worker("Santa", 1400, "School teacher");
		
		//3 programmer
		Programmer programmer1 = new Programmer("Filip", 2300, new String[] {"Ruby", "C++", "HTML", "CSS"},false);
		Programmer programmer2 = new Programmer("Laura", 4000, new String[] {"Java"},true);
		Programmer programmer3 = new Programmer("Nikita", 1500, new String[] {},false);
		
		//3 Doctors
		
		Doctor doctor1 = new Doctor("Max", 2600, DoctorType.HomeDoctor, null);
		Doctor doctor2 = new Doctor("Ingus", 3200, DoctorType.Dentist, "+371 2577784");
		Doctor doctor3 = new Doctor("Martina", 1000, DoctorType.Psyholog,"+371 20205543" );

		Worker[] workerfullList = {worker1, worker2, worker3, programmer1, programmer2, programmer3, doctor1, doctor2, doctor3};
        
		drawLine();
		System.out.println("1. All programmist names");
		for(Worker worker: workerfullList) {
			if(worker instanceof Programmer) {
				System.out.println(worker.name);
				
			}
		}
		
		drawLine();
		System.out.println("All person Brutto sallary " + Worker.allWorkerSallary);
	
		drawLine();
		System.out.println("All programming lenguages, that programmes know ");
		for(Worker worker: workerfullList) {
			if(worker instanceof Programmer) {
				String[] languages = ((Programmer)worker).programmingLanguages;
				for(String pg: languages) {
					System.out.println(pg);
				}
			}
		}
		drawLine();
		System.out.print("Who works as  Dentist? ");
		for(Worker worker: workerfullList) {
			if(worker instanceof Doctor) {
				if(((Doctor)worker).dType == DoctorType.Dentist){
					System.out.println(worker.name);
				}
			}
		}
		
	
	}

}
