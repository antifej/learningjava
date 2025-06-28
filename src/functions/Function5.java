package functions;

import java.util.HashMap;
import java.util.Scanner;
public class Function5 {
	
	public static void printHashMapValue(HashMap<String,String> map) {
		for(String oneValue: map.values()) {
			System.out.println(oneValue +"");
			
		}
	}
	
	public static void findHashMapObject(HashMap<String,String> map) {
		Scanner sk1 = new Scanner(System.in);
		System.out.print("Enter country>");
		String country = sk1.nextLine();
		if(map.containsKey(country)) {
			System.out.println(country + "capital is "+ map.get(country));
			
		}else {
			System.out.print(country +"no key");
		}
		
	
	}

}
