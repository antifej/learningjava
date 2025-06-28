package class_workers;

public class Programmer extends Worker {
	public String[] programmingLanguages;
	public Boolean isWorkingHome;
	
	
	public Programmer(String name, double sallary, String[] programmingLanguages, Boolean isworkingHome) {
		super(name, sallary, "Programmer");
		
		this.programmingLanguages = programmingLanguages;
		this.isWorkingHome = isworkingHome;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		//super.doWork();
		if(this.isWorkingHome) {
			System.out.println(super.name +" is programming at home");
		}else {
			System.out.println(super.name + " is programming in office");
		}
		
	}
	
	
	public void aboutProgrammer(){
		super.aboutWorker();
		System.out.println(" is working home " + this.isWorkingHome);
		if(this.programmingLanguages.length >0) {
			System.out.println("Know Progmramming languages:");
			for(String language: this.programmingLanguages ) {
				System.out.println(language +" ");
			}
		}else {
			System.out.println("Dont know any programming languages!  😶");
		}
		
		System.out.println("========================================");
		
	}
	
	
	

}
