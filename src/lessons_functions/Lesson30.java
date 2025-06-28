package lessons_functions;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

public class Lesson30 {
//24.05.2025
	//HashMap integer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> myMarks = new HashMap<String, Integer>();
		myMarks.put("Math", 8);
		myMarks.put("Informatiks", 6);
		myMarks.put("english", 9);
		myMarks.put("sport", 10);
		myMarks.put("Fizika", 8);
		myMarks.put("Music", 6);
		myMarks.put("Biology", 7);
		
		System.out.println("Mark count " + myMarks.size());
		
		int markSum =0;
		for(int oneMark: myMarks.values()) {
			markSum+=oneMark;
		}
		System.out.println("Total sum of marks is " + markSum);
		
		
		double averageMark =(double) markSum / myMarks.size();
		DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
		System.out.println("Average mark is " + decimalFormat.format(averageMark));
		

		// Find min and max grade
		int minGrade = 10;
		String minClassName="";
		Entry<String, Integer> minSet=null;
		
		int maxGrade=0;
		Entry<String, Integer>maxSet=null;
		
		for(Entry<String, Integer> oneSet: myMarks.entrySet()) {
			System.out.println(oneSet);
			if(minGrade > oneSet.getValue()) {
				minGrade = oneSet.getValue();
				minClassName = oneSet.getKey();
				minSet =oneSet;
			}
			if(maxGrade <oneSet.getValue()) {
				maxGrade = oneSet.getValue();
				maxSet=oneSet;
			}
			
		}
		System.out.println("Min grade is "+ minSet.getValue() + " in " +minSet.getKey());
		System.out.println("Max garde is "+ maxSet.getValue() + " in " +maxSet.getKey());
		
		
		
		
	}

}
