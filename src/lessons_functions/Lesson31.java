package lessons_functions;

public class Lesson31 {
//24.05.2025
	//2D array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] dArray = {{23,12,45,1},
    		           {33,80,55,2},
    		           {71,42,99,5}};
     
     System.out.println(dArray[1][1]);
     
     System.out.println(dArray[2][2]);
     System.out.println(dArray[0][3]);
     System.out.println(dArray[1][0]);
     System.out.println("Third array row numbers are");
     for(int i : dArray[2]) {
    	 System.out.print(i +" ");
     }
     System.out.println();
     System.out.println("Object count in first line is " + dArray[0].length);
     
     System.out.println("Full 2D array");
     for(int l =0; l<dArray.length; l++) {
    	 
    	 for(int k =0; k<=dArray.length; k++) {
    		 System.out.println(dArray[l][k]+" ");
    	 }
    	 System.out.println();
     }
     
     String[][] products = {{"Milk", "Bread", "salami", "cheese"},
    		 {"fish", "tea", "meat", "sugar", "coffe"},
    		 {"chicken", "bacon", "picca", "pepper", },
    		 {"burger", "lemonade"},
    		 {}};
     int totalProductCount=0;
     for( int i =0; i< products.length;i++) {
    	 totalProductCount += products[i].length;
    	 
     } 
    	System.out.println("Product count is " + totalProductCount);
    	 
    	System.out.println("All products from array ");
    	int foodNum=1;
    	for(int l=0; l<products.length; l++) {
    		for(int k=0; k<products[l].length; k++) {
    			System.out.print(foodNum+"."+products[l][k] +" ");
    			foodNum++;
    			
    		}
    		System.out.println();
    		
    	}
    	
    	System.out.println("Random food from array");
    	int ranMasIndex =(int) (Math.random()*products.length);
    	int randObjectIndex = (int)( Math.random()*products[ranMasIndex].length);
    	System.out.println(ranMasIndex +" "+ ranMasIndex);
    	
    	System.out.println(products[ranMasIndex][randObjectIndex]);
     
    		 
     }
	}


