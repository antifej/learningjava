package Lessons_class;
import java.util.ArrayList;

import Java_class.Person;
import Java_class.Pet;
import java_enum.PetType;
//07.06.2025.
//Person class objects
public class Lesson35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person.printWorkIndustry();
		
		Person personJanis = new Person("Janis", 32, true, "RTU Mechanic High education", null);
		Person personLaura = new Person("Laura", 22, true, "Secondary education", new Pet("Minka", PetType.CAT));
		Person personKaspars = new Person("Kaspars", 54, false, "DU programmer", new Pet("Zuļin", PetType.TURTLE));
		Person personLudis = new Person("Ludis", 32, false, "DU programm tester", new Pet("Barsik", PetType.CAT));
		Person personMaira = new Person("Maira", 18, true, "Computer technics", new Pet("Ben", PetType.FISH));
		
		System.out.println("Total person count is "+ Person.personCount);
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(personJanis);
		personList.add(personLaura);
		personList.add(personMaira);
		personList.add(personKaspars);
		personList.add(personLudis);
		personList.add(new Person("Ilgmārs", 45, true, "Technic", new Pet("Arcy", PetType.SNAIL)));
		
		System.out.println("All person description");
		for(Person p :personList) {
			p.describePerson();
			
		}
		
		System.out.println("Find oldest person in list");
		Person oldestPerson = personList.get(0);
		
		for(Person p:personList) {
			if(oldestPerson.age < p.age) {
				oldestPerson = p;
				
			}
		}
		oldestPerson.describePerson();
		
		//Print persons who has cats
		System.out.println("Persons who has cats!");
		for(Person p: personList) {
			//chek if person pet is not null
			if(p.personPet != null) {
			if(p.personPet.type==PetType.CAT) {
				System.out.print(p.name+"");
			}
		}
		
	}

		
		
		
		
	}}
