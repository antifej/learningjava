package java_animals;

public class Animal {
	public String name;
	public int age;
	public AnimalType type;
	
	protected Animal(String name, int age, AnimalType type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public Animal(String name, int age) {
		this.type = AnimalType.UNKNOWN;
		this.age = age;
		this.name = name;
		
		System.out.println(this.name + " created!");
	}
	
	
	public void speak() {
		System.out.println("Animal " + this.name+" is speaking!");
	}
	
	public void aboutAnimal() {
		System.out.println("Name "+ this.name +". Type " + this.type + ". Age "+ this.age);
	}

}