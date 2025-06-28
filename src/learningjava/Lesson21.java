package learningjava;

public class Lesson21 {

	//for loop
	//16.05.2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=100; i<=1000;i+=100) {
        	System.out.print(i+" ");
        }
        System.out.println("");
        for(int x=500; x>=400; x-=10) {
        	System.out.print(x+" ");
        } 
        System.out.println("");
        for(int y=-10; y<=4; y+=2) {
        	System.out.print(y+" ");
        }
        System.out.println("");
        for(int z=15; z<=45;z+=5) {
        	System.out.print(z+" ");
        }
        
        System.out.println("");
        for(int i=10; i<=20;i++) {
        	if(i==13 || i==16 || i==19) continue;
        	System.out.print(i+" ");
        }
	}

}
