package lessons_functions;
import java.util.HashMap;
import functions.Function5;
//22.05.2025
//Hash Map
public class Lesson28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, String> capitalCities = new HashMap<String,String>();
        capitalCities.put("Latvia", "Daugavpils");
        capitalCities.put("Lithuania", "Vilnius");
        capitalCities.put("Estonia", "Talin");
        capitalCities.put("Poland", "Warsaw");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("China", "Pekin");
        
        
        System.out.println(capitalCities);
        System.out.println("Poland capital is "+capitalCities.get("Poland"));
        
        Function5.printHashMapValue(capitalCities);
        Function5.findHashMapObject(capitalCities);
        
	}

}
