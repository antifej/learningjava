package learningjava;
import java.util.Scanner;

public class Lesson18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int summ=0;
		while(i<=3) {
		
		
		System.out.print("Enter number "+(i+1)+". >");
		int number = scan.nextInt();
		summ +=number;
		i++;
		

	}
System.out.println("All number sum is "+summ);
int average = summ/4;
System.out.println("Average of 4 numbers is " + average);
}}
