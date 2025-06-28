package java_animals;

public class Dog extends Animal{
	public String favoriteFood;
	public boolean isAngry;
	
	public Dog(String name, int age,  String favoriteFood, boolean isAngry) {
		super(name, age, AnimalType.DOG);
		this.favoriteFood = favoriteFood;
		this.isAngry = isAngry;
		
		System.out.println(super.name + " is created!");
	}
	public void aboutDog() {
		super.aboutAnimal();
		System.out.println("Favorite food is " + this.favoriteFood + ". Is angry "+ this.isAngry);
		System.out.println("-------------------------------------------------------");
	}
	@Override
	public void speak() {
		System.out.println(super.name +". Vaw-Vaw-Vaw!");
	}
	
	public void bite() {
		if(this.isAngry) {
			System.out.println(super.name + " will bite");
		}else {
			System.out.println(super.name +" will not bite!"); 
			
		}
		
	}
	
	
	
	
}
