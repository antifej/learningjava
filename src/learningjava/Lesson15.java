package learningjava;

public class Lesson15 {
//09.05.2025
	//Random numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int randomNumber1 = (int)(Math.random() *100)+1;
        System.out.println("Random number is " + randomNumber1);
        
        int rn2 = (int)(Math.random() *4 ) +3;
        System.out.println("Random number2 " + rn2);
        
        
        int rn3 = (int)(Math.random() *51) +100;
        System.out.println("Random number3 " + rn3);
        
        int rn4 = (int)(Math.random() *11) +230;
        System.out.println("Random number4 " + rn4);
        
        int rn5 = (int)(Math.random() *100) +1;
        System.out.println("Random number5 " + rn5);
        if (rn5 >=30 && rn5 <=40) {
        	System.out.println("You won Nintendo Swithc 2");
        }
        
        
        
        		
 
        
       
	}
	}


