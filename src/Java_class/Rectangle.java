package Java_class;
//29.05.2025
public class Rectangle {
	public final int  DEGREE = 90;
	public int width=0;
	public int height=0;
	
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
		
		System.out.println("Rectangle"+ this.width +" x " +this.height +" created!");
	}
     public int getP() {
    	 return (this.width+ this.height)*2;
    	 
     }
     public int getS() {
    	 return (this.width* this.height);
     }
}
