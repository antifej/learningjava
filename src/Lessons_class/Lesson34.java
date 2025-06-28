package Lessons_class;
import Java_class.Rectangle;
public class Lesson34 {
//29.05.2025
	//Ractangle class objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(42,58);
		Rectangle rect2 = new Rectangle(70,70);
		Rectangle rect3 = new Rectangle(100,20);
		
		
		System.out.println("Rect1 P="+rect1.getP());
		System.out.println("Rect1 S="+rect1.getS());
		
		//randomRektangle/w(1-100). h(1-100)S-? P-?
		
		int randomwidth = (int)( Math.random() *100) +1;
		int randomheight = (int)( Math.random()*100) +1;
		
		Rectangle randomRectangle = new Rectangle(randomwidth, randomheight);
		System.out.println("Random raectangle S="+ randomRectangle.getS());
		System.out.println("Random raectangle P="+ randomRectangle.getP());

	}

}
