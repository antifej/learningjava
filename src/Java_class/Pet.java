package Java_class;
import java_enum.PetType;
//Persons Pet
public class Pet {

public String petName;
public PetType type;

public Pet(String petName, PetType type) {
	this.petName = petName;
	this.type = type;
}

public void printPetDescription() {
	System.out.println("Pet Name "+ this.petName + " pet type "+ this.type);
}

}
