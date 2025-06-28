package Java_class;

public class Car {
     public String model="no model";
     public double price;
     public boolean isNew=false;
     
     public Car(String model, double price, boolean isNew) {
     this.model =model;
     this.price =price;
     this.isNew =isNew;
     System.out.println("Car " + this.model + " created!");
     }
     public void writeAboutCar() {
     System.out.println("Car model " + this.model + ". Price " +this.price +". Is new " + this.isNew);
     
     
     }
     
     public void buyCar(double money) {
    	 if(this.price <= money) {
    	 System.out.println("You can buy "+ this.model);
    	 
     }else {
    	 System.out.println("You can not buy "+ this.model);
    	 double more = this.price - money;
    	 System.out.println("You can not buy "+ this.model + " You need "+money+ " € money");
     }
    	 
    	
    			 
    		 }
    	 }