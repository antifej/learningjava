package lessons_functions;
import functions.Function4;
import functions.Function2;

public class Lesson27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String textFilePath = "src/text_files/text1.txt";
    
///    Function4.readTextFile(textFilePath);
///    Function4.writeToFile(textFilePath, "Java added some text to this file😂");
    String[] computerModels = {"MSI", "ASUS", "Lenova", "Toshiba", "Sony", "MacBook", "Aser", "HP"};
    Function2.printArray(computerModels);
    
    String randomComputerModel = Function4.selectRandomArrayObject(computerModels);
    System.out.println("Random model " +randomComputerModel);
    
    
    String computerFile = "src/text_files/computers.txt";
    Function4.writeToFile(computerFile, randomComputerModel);
    
	}

}
