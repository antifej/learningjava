package lessons_functions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lesson26 {
//20.05.2025
	//Function in main file
	public static void writeDate() {
		
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	//Y = 5X-SQR(z)
	
	public static double mathTask1(double x, double z) {
		double y=5*x - Math.sqrt(z);
		
		return y;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      writeDate();
      double y = mathTask1(2,4);
      System.out.println("Y="+y);
      
      if(y >0) {
    	  System.out.println(y + "pozitive number");
    	  
      }else if(y<0) {
    	  System.out.println(y + "negative number");
      }
	}

}
