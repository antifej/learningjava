package lessons_functions;

import functions.Function3;
public class Lesson25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randNumb1 = Function3.generateRandomNumber(5,8);
		System.out.println("Rand number (5,8) "+ randNumb1);
		
		
		System.out.println("RN (0:2)" +Function3.generateRandomNumber(0,2));
		
		
		int number1 = Function3.intNumberWhile();
		int number2 = Function3.intNumberWhile();
		
		System.out.println("Two number sum is " +(number1 + number2));
		
		

	}

}
