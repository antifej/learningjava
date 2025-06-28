package lessons_class_inheritance;
import java_animals.Animal;
import java_animals.AnimalType;
import java_animals.Cat;
import java_animals.Dog;
import java_animals.FatCat;

public class Lesson42 {
	public static void printLine() {
		System.out.println("------------------------------------------------");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Arnold", 12);
		Animal animal2 = new Animal("Max", 1);
		
		animal1.aboutAnimal();
		animal2.aboutAnimal();
		
		//3 - Cat
		Cat cat1 = new Cat("Barsik", 2, "Whool bool ", 9);
		Cat cat2 = new Cat("Felix", 1, "Toy mouse", 9);
		Cat cat3 = new Cat("SnowBall", 5, "Toy fish", 8);
			
		//3 - Dog
		Dog dog1 = new Dog("Mercury", 7, "Stick", true);
		Dog dog2 = new Dog("Rex", 11, "Dog Food", false);
		Dog dog3 = new Dog("Chuppy", 3, "Meat", true);
		Dog dog4 = new Dog("Ashley", 7, "Pork", true);
		
		
		//3FatCat
		
		FatCat fatCat1 = new FatCat("Bemby", 2, "ToyFood",4, 10);
		FatCat fatCat2 = new FatCat("Iggy", 6, "ToyHouse",9, 12);
		FatCat fatCat3 = new FatCat("Tomas", 4, "Laser",9, 34);
		
		
		//Get description about Animal ( name, age)
		Animal[] animalList = {animal1, animal2, cat1, cat2, cat3, dog1, dog2, dog3,dog4, fatCat1, fatCat2, fatCat3};
		
		printLine();
		System.out.println("Animal description");	
		for(Animal oneAnimal : animalList) {
			oneAnimal.aboutAnimal();
		}
		//What animals are speaking? 
		printLine();
		System.out.println("Animals are speaking");
		for(Animal oneAnimal: animalList) {
			oneAnimal.speak();
		}
		printLine();
		//Find all cat Names
		System.out.println("All cat names:");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal.type == AnimalType.CAT) {
				System.out.print(oneAnimal.name +" ");
			}
			
		}
		
		//find all dog names
		
		printLine();
		System.out.println("All dog names:");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal instanceof Dog) {
				System.out.print(oneAnimal.name +" ");
			}
		}
		
		//get dogs the bite
		
		printLine();
		System.out.println("Print dog bite:");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal.type== AnimalType.DOG) {
				
				
				((Dog)oneAnimal).bite();
			}
		}
		
		//get cat full description
		
		printLine();
		System.out.println("Cat full description: ");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal instanceof Cat) {
				((Cat)oneAnimal).aboutCat();
				
			}
		}
		
		//Print all friendly dog names
		
		printLine();
		System.out.println("Friendly dog names:");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal.type == AnimalType.DOG) {
				if(!((Dog) oneAnimal).isAngry) {
					System.out.println(oneAnimal.name);
					
				}
			}
		}
		printLine();
		System.out.println("Animals names:"); 
		for(Animal oneAnimal: animalList) {
			if(oneAnimal.type == AnimalType.UNKNOWN) {
				System.out.println(oneAnimal.name);
			}
			
		}
		printLine();
		System.out.println("Age of all cats:");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal.type == AnimalType.CAT) {
				System.out.println(oneAnimal.age);
			}
		}
		printLine();
		System.out.println("All cat toys:");
		for(Animal oneAnimal: animalList) {
			if(oneAnimal.type == AnimalType.CAT) {
				
				System.out.println(((Cat) oneAnimal).toy);
			}
			}
		printLine();
		System.out.println("Names of cat and animals:");
		for(Animal oneAnimal: animalList) {
			if(!(oneAnimal.type == AnimalType.DOG)) {
				System.out.println(oneAnimal.name);
			}
		}
		
		System.out.println("Fat cat count " + FatCat.fatCatCount);
		
		//Print all fat cat names and weight
		printLine();
		for(Animal oneAnimal: animalList) {
			if(oneAnimal instanceof FatCat) {
				//System.out.println(oneAnimal.name+" weight is "+((FatCat)oneAnimal).weight);
			((FatCat) oneAnimal).printFatCatInfo();
			}
		}
		printLine();
		System.out.println("Fat cat weight after + 30%");
		//All Fat cats after +30% weight
		for(Animal oneAnimal: animalList){
			if(oneAnimal instanceof FatCat) {
				((FatCat)oneAnimal).increaseFat();
				((FatCat)oneAnimal).printFatCatInfo();
			}
			
		}
		
		
		
		
	}
}
