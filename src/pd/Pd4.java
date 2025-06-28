package pd;

import java.util.Scanner;

public class Pd4 {
// Timofejs Fedotovs 16.05.2025
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner myScanner = new Scanner(System.in);
		
		// uzdevums4
		
		int randomNumber1 = (int)(Math.random() *6)+50;
      System.out.println("Random number is " + randomNumber1);
      
      // uzdevums5
      
      int randomNumber2 = (int)(Math.random() *2)+100;
      System.out.println("Random number is " + randomNumber2);
      
      //uxdevums6
      
      int rDavana = (int)(Math.random() *5)+1;
      
      
      
      switch(rDavana) {
      case 1: System.out.println("Portativais dators"); break;
      case 2: System.out.println("Datorpele"); break;
      case 3: System.out.println("Web Kamera"); break;
      default: System.out.println("Zekes");
      }
      // uzdevums7
      
      int z = 12;
      while(z<=24) {
    	System.out.print(z+" ");
    	z+=2;
    			  
      }
      //uzdevums 8
      
      System.out.println("");
	  int x = 189;
      while(x>=168) {
    	  System.out.print(x+" ");
    	  x-=3;
    	  
      }
      
	
	//uzdevums 9
      System.out.println("");
	int y = 1;
	while(y<=8) {
		System.out.println("MC+ programesanas kurs");
		y++;
	}
	
	
	}
      

}


    
      
      
       
     
      
      
      
      
      
	


