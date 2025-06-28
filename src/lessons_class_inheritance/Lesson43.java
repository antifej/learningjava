package lessons_class_inheritance;

import class_product.Clothe;
import class_product.Food;

public class Lesson43 {
	public static void printLine() {
		System.out.println("------------------------------------------------");	
	}
	
	
	public static void main(String[] args) {
		
		Clothe clothe1 = new Clothe("Pop it", 2.30, false, "3");
		Clothe clothe2 = new Clothe("Addidas Shoes", 45.99, true, "45");
		Clothe clothe3 = new Clothe("Labubu", 14.99, true, "5");
		Clothe clothe4 = new Clothe("Fila Jeans", 34.99, false, "L");
		Clothe clothe5 = new Clothe("Sandic Shoes", 12.99, true, "43");
		
		Food food1 = new Food("Picca Lulu", 14.99, 1.3, false);
		Food food2 = new Food("Bananas", 1.23, 3, true);
		Food food3 = new Food("Lemons", 0.8, 0.4, true);
		Food food4 = new Food("Chocolate Cake", 23.44, 1.5, false);

		
	}

}
