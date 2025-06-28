package lessons_functions;
import functions.Function2;
public class Lesson24 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String[] popularBrands = {"Nike", "Pepsi","Puma", "Bosch", "Colgate", "Audi", "EA"};
		Function2.printArray(popularBrands);
		
		String[] dangerousAnimals = {"Crocodile", "Snake", "Hippo", "Spider", "Kenguru", "Hamster" };
		Function2.printArray(dangerousAnimals);
		
		Function2.printLastObjectFromArray(popularBrands);
		Function2.printLastObjectFromArray(dangerousAnimals);
		
		int[] mathExamGrades = {5,2,9,4,4,8, 7, 10, 4,5,6,7};
		System.out.println("Math grade count in array is"  + mathExamGrades.length);
		Function2.printArray(mathExamGrades);
		Function2.printLastObjectFromArray(mathExamGrades);
		
		int numberSum = Function2.summArrayNumber(mathExamGrades);
		System.out.println("Math grade total sum is " + numberSum);

		double averageMark = Function2.getAverageValueFromIntArray(mathExamGrades);
		System.out.println("Average mark is" + averageMark);
		
		
		System.out.println("Minimal mark is" + Function2.getMinValueFromArray(mathExamGrades));
		
		int arrayMax = Function2.getMaxValueFromArray(mathExamGrades);
		System.out.println("Max value is" + arrayMax);
		
		boolean founCocaCola = Function2.findStingInStringArray(popularBrands, "Coca-cola");
		
		if(foundCocaCola==true)System.out.println("Coca-Cola found in array");
		else System.out.println("Coca-Cola not found in array");
		
		
		boolean foundAnaconda =Function2.findStringInStringArray(dangerousAnimals,  "Anaconda");
		System.out.println("Anaconda found in array:" + foundAnaconda);
				
		
	}
	
	
		
		
	}


