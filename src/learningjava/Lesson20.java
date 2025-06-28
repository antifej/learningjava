package learningjava;
import java.util.Scanner;
public class Lesson20 {
//16.05.2025
	//Break
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sk1 = new Scanner(System.in);
       
       while(true) {
    	   System.out.print("Input number (0 to exit) >");
    	   double number = sk1.nextDouble();
    	   if(number == 0) {
    		   System.out.println("End of input");
    		   break;
    		   
    	   }
       }
	}

}
