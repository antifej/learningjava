package learningjava;

public class Lesson22 {
    //16.05.2025
    //Arrays - Masivi
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] carBrands = {"Mazda","Audi","BMW","Ford","Nissan","Toyota","Lexus","Tesla","VW","Mercedes"};
		System.out.println(carBrands[3]); 
		System.out.println("First car in array is " + carBrands[0]);
		System.out.println("Last car in array is " + carBrands[carBrands.length -1]); 
		System.out.println("Brend count in array is " + carBrands.length);
		System.out.println("Car print with WHILE");
		int i=0; 
			while(i<carBrands.length) {
				System.out.print(i+1+". "+carBrands[i] +" ");
				i++;
			}
			
			
			System.out.println();
			int s = 1;
			for(String oneCar : carBrands) {
				System.out.print(s+". "+oneCar+" ");
				s++;
		}
	}
}

