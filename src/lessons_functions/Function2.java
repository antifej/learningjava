package lessons_functions;
//Funkcijas darbā ar masīviem
//18.05.2025.
public class Function2 {
	
	public static void printArray(String[] array) {
		//foreach
		for(String oneObject:array) {
			System.out.print(oneObject +" ");
		}
		System.out.println();
	}
	

 
       public static int getMinValueFromArray(int[] array) {
    	   int minValue=Integer.MAX_VALUE;
    	   
    	   for(int oneNumber: array) {
    		   if(oneNumber < minValue) {
    			   minValue = oneNumber;
    		   }
    	   }
    	   
    	   
    	   return minValue;
       }
       
       
       public static int getMaxValueFromArray(int[] array) {
    	   int maxValue = array[0];
    	   
    	   for(int oneNumber:array) {
    		   if(oneNumber > maxValue) {
    			   maxValue = oneNumber;
    		   }
    	   }
    	   return maxValue;
       }
       
       
       public static boolean findStringInStringArray(String[] array, String objectName) {
    	   
    	   String brendToFind = "Coca-cola";
    	   for(String oneObject: array) {
    		   if(oneObject.equals(brendToFind)) {
    			   return true;
    		   }
    	   }
    	   
    	   
    	   
    	   return false;
       }
}