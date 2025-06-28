package learningjava;
//10.05.2025
//Continue and break
public class Lesson17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		while(i<=55) {
			System.out.print(i+" ");
			i+=5;
			
			
			
		} 
		System.out.println();
		
		
		int x=100;
			while(x>=20) {
				System.out.print(x+" ");
				x-=10;
			}
           System.out.println();
        
           double l = 1.0;
           while(l<=2.1) {
        	   System.out.print(String.format("%.1f", l)+" ");
        	   l+=0.1;
           }
	}
}

