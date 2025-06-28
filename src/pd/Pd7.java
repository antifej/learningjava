package pd;
//Timofejs Fedotovs 
//27.05.2025
public class Pd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int [][] dArray = {{5,12,65},
				           {33,89,1},
				           {6,4,56}};
		
		int objectCount =0;
		int sum = 0;
		for(int l =0; l<dArray.length; l++) {
		objectCount += dArray[l].length;
		for(int k =0; k<dArray.length; k++) {
   		 	sum += dArray[l][k];
   		 	
		}
		
		
			
		}
		System.out.println(sum);
		double average = (double)sum/(double)objectCount;
		System.out.println(average);
		
		System.out.println("Element count in array " + objectCount);
	    
		
		
		System.out.println(dArray[2][1]);
		System.out.println(dArray[2][2]);
		System.out.println(dArray[0][1]);
		
		 for(int i : dArray[2]) {
	    	 System.out.print(i +" ");
	    	 
	    	 
	     }
		 System.out.println();
		 String[][] clothes = {{"hat","suit","shoes"},
				               {"t-shirt","jeans","pijama"}};
		 
		 int clothNum=1;
	    	for(int l=0; l<clothes.length; l++) {
	    		for(int k=0; k<clothes[l].length; k++) {
	    			System.out.print(clothNum+"."+clothes[l][k] +" ");
	    			clothNum++;
	    		}
	    	}
		 clothes[0][1] = "jacket";
		 boolean isFound = false;
		 for(int l=0; l<clothes.length; l++) {
	    		for(int k=0; k<clothes[l].length; k++) {
	    			if(clothes[l][k].equals("jeans")) {
	    				isFound=true; break;
	    				
	    				
	    			}
	    		}
	    	}
		 
		if(isFound==true)System.out.println("\nJeans found");
		else
			System.out.println("\not found");
		 
		
	    		}
	    	
		 
	}


