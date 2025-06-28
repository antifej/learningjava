package java_animals;

public class Cat extends Animal{
	public String toy;
	public int catLives;
	
	public Cat(String name, int age, String toy, int catLives) {
		super(name, age, AnimalType.CAT);
		this.toy = toy;
		this.catLives = catLives;
		
		System.out.println(super.name + " is created! ");
	}
	
	public void aboutCat() {
		super.aboutAnimal();
		System.out.println("Toy " + this.toy + ". Has lives " + this.catLives);
		System.out.println("---------------------------------------------");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		//super.speak();
		System.out.println(super.name+ ":Ņav-Ņav-Ņav");
	}
	
	

	
}
