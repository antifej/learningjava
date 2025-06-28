package functions;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//20.05.2025
public class Function4 {
	//Function that select random object from array
	
	public static String selectRandomArrayObject(String[] array) {
		int randomIndex = (int) (Math.random()* array.length);
		return array[randomIndex];
	}
	
	public static void writeToFile(String filePath, String textToWrite) {
		try {
			File myFile = new File(filePath);
			FileWriter myFileWriter = new FileWriter(myFile, true);
			myFileWriter.write("\n"+textToWrite);
			myFileWriter.close();
			System.out.println("Text added to file " +textToWrite);
			
		}catch (Exception e) {
			System.out.println("File not found "+ e.toString());
		}
	}

	public static void readTextFile(String filePath) {
		try {
		File textFile = new File(filePath);
		
		if(textFile.exists()) {
			System.out.println("File " + textFile.getName() +" exist!");
			Scanner fileScan = new Scanner(textFile);
			while(fileScan.hasNextLine()) {
				String oneLine = fileScan.nextLine();
				System.out.println(oneLine);
				
			}
			fileScan.close();
		}else {
			System.out.println("File " +textFile.getName() +" does not exist!");
		}
		}catch (Exception e) {
			System.out.println("File not found error!");
			System.out.println(e.toString());
		}
		
	}
}
