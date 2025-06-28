package Java_class;
//07.06.2025.
//Person class
public class Person {
	public static String workIndustry = "IT";
	public static int personCount =0;
	
	public String name;
	public int age;
	public boolean isHappy;
	public String education;
	
	public Pet personPet;
	
	public Person(String name, int age, boolean isHappy, String education, Pet personPet) {
		this.name = name; 
		this.age = age;
		this.isHappy = isHappy;
		this.education = education;
		personCount++;
		
		this.personPet = personPet;
		
		System.out.println("New person "+ this.name +" created!");
		
	}
	
	public void describePerson(){
		System.out.println("Name:"+ this.name +", age:"+ this.age +
				", isHappy:" + this.isHappy+", education " + this.education );
		
		if(this.personPet != null) {
			this.personPet.printPetDescription();
		}else {
			System.out.println(this.name +" has no pets! :(");
		}
		
	}
	
	public static void printWorkIndustry() {
		System.out.println("Person work industry are "+ workIndustry);
		
	}
	
	

}
