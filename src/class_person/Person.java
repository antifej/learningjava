package class_person;

public class Person {
	public String name;
	public int age;
	public boolean isHappy;
	
	public Person(String name,int age, boolean isHappy) {
		this.name = name;
		this.age = age;
		this.isHappy = isHappy;
	}
	
	public void aboutPerson() {
		System.out.println("Person name" + this.name + "Person age" + this.age + "Is happy" + this.isHappy);
	}

}
