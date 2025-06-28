package class_workers;

public class Doctor extends Worker {
	public DoctorType dType;
	public String phone;
	

	public Doctor(String name, double sallary, DoctorType type, String phone) {
		super(name, sallary, "Doctor");
		
		this.dType = type;
		this.phone = phone;
		
	}


	@Override
	public void doWork() {
		System.out.println(super.name +" Is worker as " + this.dType);
	}
	
	public void aboutDoctor() {
		super.aboutWorker();
		System.out.println("Type "+ this.dType +"phone "+ this.phone);
	}
	
	

}
