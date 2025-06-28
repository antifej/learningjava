package learningjava;

public class Lesson19 {
//16.05.2025
	//continue
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All classes in Midle school:");
    int x = 1;
    while(x<=12) {
    	System.out.println(x+".Clase");
    	x++;
    	
    	
    }
    
    
    
    int i=0;
    while(i<=9) {
    	i++;
    	if(i==4 || i==8)continue;
    	System.out.print(i+"");
    	
    }
	}

}
