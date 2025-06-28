package Java_class;
import java_enum.Profession;
import Java_class.Home;
import java_enum.HomeType;
public class Worker {
	public static String companyName = "SIA MC+";
	public static int work_hours = 8;

	public Profession professione;
	public String name;
	public boolean isTired;
	public double salaryPerHour;
	public Home workerHome;
	
	public Worker(Profession prof, boolean isTired, double salary, String name, Home workerHome) {
		this.professione = prof;
		this.isTired = isTired;
		this.salaryPerHour = salary;
		this.name = name;
		this.workerHome = workerHome;
		System.out.println("Worker " + this.name +" created");
		
	}
	public void printWorkerData() {
		
		System.out.println("Name -"+ this.name +". Profession " +this.professione + ". IsTired " +this.isTired +". Salary" + this.salaryPerHour +". Works in "+companyName +". Home "+ work_hours);
	if(this.workerHome != null) {
	
		System.out.println(this.name + "home is");
		workerHome.printInfoAboutHome();
		}else {
			System.out.println(this.name + "has no home! ");
		}
	}
	
	public double salaryPerDay() {
		return work_hours* this.salaryPerHour;
		
	}
	
	public double salaryPerWorkDays(double workDays) {
		return this.salaryPerDay() * workDays;
		
	}
}
