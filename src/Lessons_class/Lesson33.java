package Lessons_class;
import Java_class.Car;
public class Lesson33 {
   //29.05.2025
	//Car class objects
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Car car1 = new Car("BMW X5", 5000.01, false);
		Car car2 = new Car("Lexus",  11000, true);
		Car car3 = new Car("Peugeot 305", 1500.05, false);
		Car car4 = new Car("Audi TT", 13000.50, false);
		Car car5 = new Car("Mercedes SLK", 27300.25, false);
		Car car6 = new Car("Volvo", 3000.01, false);
		
		//BMW XS 2005, 5000 False
	//	car1.writeAboutCar();
	 //   car2.writeAboutCar();
	//	car3.writeAboutCar();
	//	car4.writeAboutCar();
	//	car5.writeAboutCar();
	//	car6.writeAboutCar();
		
		
		Car[] carArray = {car1, car2, car3, car4, car5, car6};
		int i= 1;
		
		for( Car oneCar:carArray) {
			System.out.print(i+". ");
			oneCar.writeAboutCar();
			i++;
		}
		System.out.println("Car count in array is "+ carArray.length);
		
		double janisCapital = 7000.05;
		
		for(Car oneCar: carArray) {
			oneCar.buyCar(janisCapital);
		}
		 System.out.print("All new cars are:");
    	 for(Car oneCar: carArray) {
    		 if(oneCar.isNew == true) {
    			 System.out.println(" "+ oneCar.model);
    		 }
    		 
    	 
		
		
    	 }
    	 System.out.print("All old cars are:");
		 for(Car oneCar: carArray) {
			 if(oneCar.isNew ==false) {
				 System.out.print(" "+oneCar.model);
			 }
		 }
		 
		 
	}}

	

	
