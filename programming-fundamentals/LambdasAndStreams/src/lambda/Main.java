package lambda;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> listPerson = Arrays.asList(
				new Person("Astrogildo", 20),
				new Person("Magnólia", 2145),
				new Person("Dracula", 4541563),
				new Person("Astolfo", 2)
				);
		
		// Sort list by name
		listPerson.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));
		for (Person person : listPerson) {
			System.out.println("Name: " + person.getName());
		}
		
		System.out.println("=====================================");
		
		// Sort list by age
		listPerson.sort((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge()));
		for (Person person : listPerson) {
			System.out.println("Age: " + person.getAge());
		}
	}

}
