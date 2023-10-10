package methodRefernce;
import java.io.*;
import java.util.*;

public class GFG {
	public static int compareByName(Person a, Person b)
	{
		return a.getName().compareTo(b.getName());
	}
	public static int compareByAge(Person a, Person b)
	{
		return a.getAge().compareTo(b.getAge());
	}
	public static void main(String[] args)
	{

		List<Person> personList = new ArrayList<>();

		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));

		// Using static method reference to
		// sort array by name
		Collections.sort(personList,(i1,i2)->i1.getName().compareTo(i2.getName()));
		Collections.sort(personList,(i1,i2)->i1.getAge().compareTo(i2.getAge()));
		Collections.sort(personList,GFG::compareByAge);
		Collections.sort(null);

		// Display message only
		System.out.println("Sort by name :");

		// Using streams over above object of Person type
		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
		personList.stream()
		.map(x -> x.getName())
		.forEach(i->System.out.println(i));
		
		// Now using static method reference
		// to sort array by age
		Collections.sort(personList, GFG::compareByAge);

		// Display message only
		System.out.println("Sort by age :");

		// Using streams over above object of Person type
		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
	}
}

