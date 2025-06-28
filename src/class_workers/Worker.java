package class_workers;
//28.06.2025


public  class Worker {
	public String name;
	public double sallary;
	public String proffesion;
	
	public static double allWorkerSallary;
	
	public Worker(String name, double sallary, String proffesion) {
		this.name = name;
		this.sallary = sallary;
		this.proffesion = proffesion;
		
		System.out.println("Worker " + this.name + " is created !");
		this.allWorkerSallary += this.sallary;
		
		
	}
	
	public void doWork() {
		System.out.println(this.name + " is working as " + this.proffesion);
		
	};
	
	public void aboutWorker() {
		System.out.println("Worker name: " +
	   this.name + " sallary: "+ 
				this.sallary + " profession " + this.proffesion);
	}
	
	public double getTax(int dependantPersonCount) {
		double tax=0;
		double socialTax = this.sallary *0.105;
		double notIncludMin = 510;
		
		double dependantMinimum = 250 * dependantPersonCount;
		double iin = (this.sallary - socialTax - notIncludMin - dependantMinimum) * 0.255;
		
		tax = socialTax + iin;
		
		
		return tax;
	} 
	
	public double NetoPay(double tax) {
		double netoSallary = this.sallary - tax;
		
		return netoSallary;
		
	}
	

}
