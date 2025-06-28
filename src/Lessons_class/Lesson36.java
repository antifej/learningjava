package Lessons_class;
import java.util.ArrayList;
import Java_class.Worker;
import java_enum.Profession;
import java.util.Scanner;
import Java_class.Home;
import java_enum.HomeType;
public class Lesson36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		Worker worker1 = new Worker(Profession.Driver, true, 5, "Alfred", new Home("Tallinas street 22-13", HomeType.Flat));
		workerList.add(worker1);
		workerList.add(new Worker(Profession.Manager, false, 15, "Irina", new Home("Gobas street 14", HomeType.Castle)));
		workerList.add(new Worker(Profession.Cleaner, true, 7, "Igor", null));
		workerList.add(new Worker(Profession.Builder, true, 8, "Andrew", new Home("Rigas street 11", HomeType.House)));
		workerList.add(new Worker(Profession.Officeworker, false, 7.50, "Sveta", new Home("Algu street 17", HomeType.Villa)));
		workerList.add(new Worker(Profession.Cooker, true, 6.50, "Andris", new Home("Rugeli street 1-11", HomeType.Tent)));
		
		System.out.println("Fifth worker is "+ workerList.get(4).name);
		System.out.println("Full information about all workers");
		for(Worker oneWorker: workerList) {
			oneWorker.printWorkerData();
		}
		//Irina salary per day
		System.out.println("Irinas salary per day is " + workerList.get(1).salaryPerDay());
		
		//All workers salery per day
		System.out.println("All workers salaries per day");
		for(Worker oneWorker: workerList) {
			System.out.println(oneWorker.name +"salary per day "+ oneWorker.salaryPerDay());
		}
		
		Scanner sk1 = new Scanner(System.in);
		System.out.print("Enter work days");
		double workDays = sk1.nextDouble();
		
		System.out.println("All workers salary for "+workDays +"days");
		double companySumPay=0;
		for(Worker w:workerList) {
			double totalSalary = w.salaryPerWorkDays(workDays);
			companySumPay += totalSalary;
			System.out.println(w.name+"get "+ totalSalary + "€");
		}
		System.out.println("Total sum, that company must pay is "+ companySumPay);
		
		//All workers get pay increase for hour 0.5, only Igor dont get promotion
		
		for(Worker w: workerList) {
		if( w.name.equals("Igor")) {
			continue;
		}else {
			w.salaryPerHour +=0.5;
			System.out.println(w.name +"new salary per hour is "+w.salaryPerHour);
			
		}

	}
		
		for(Worker w:workerList) {
			if(w.professione == Profession.Builder) {
				System.out.println("Builder is "+w.name);
			}
		}
		System.out.println("All tired workers!");
		//Find all tired workers
		
		for(Worker w:workerList) {
			if(w.isTired == true) {
				System.out.println(w.name+" must take some rest");
			}
			
			
			
		}
	}
}
