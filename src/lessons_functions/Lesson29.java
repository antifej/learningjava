package lessons_functions;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
public class Lesson29 {
	public static HashMap<String, String> readHashMapFromFile(String path){
		HashMap<String, String> carMap = new HashMap<String, String>();
		try {
		File mapFile = new File(path);
		Scanner fileScanner = new Scanner(mapFile);
		while(fileScanner.hasNextLine()) {
			String carKey = fileScanner.next();
			String carValue = fileScanner.next();
			System.out.println("Key " +carKey +" Value "+ carValue);
			carMap.put(carKey, carValue);
			
		}
		fileScanner.close();
		
		
		}catch (Exception e) {
			System.out.println("File error" + e.toString());
			
		}
		
		return carMap;
	}
	public static void writeToHashMap(String path, String key, String value) {
		File carFile = new File(path);
		try {
		FileWriter writer = new FileWriter(carFile, true);
		writer.write("\n"+key+" "+value);
		writer.close();
		}catch(Exception e) {
			System.out.println("Error while writing to file" +e.toString());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carFilePath = "src/text_files/car.txt"; 
		HashMap<String,String>carMap = readHashMapFromFile(carFilePath);

		System.out.println("Hash map loded from file");
		System.out.println(carMap);
		
		System.out.println("Car build year "+ carMap.get("year"));
		
		writeToHashMap(carFilePath, "BodyType", "CrossRover");
		writeToHashMap(carFilePath, "seats", "4");
		
		
		String carFilePath1 = "src/text_files/car1.txt"; 
		HashMap<String,String>carMap1 = readHashMapFromFile(carFilePath1);

		writeToHashMap(carFilePath1, "wheels", "4");
		writeToHashMap(carFilePath1, "seats", "5");
		writeToHashMap(carFilePath1, "weight","1950");
		
		
		
	}

}
