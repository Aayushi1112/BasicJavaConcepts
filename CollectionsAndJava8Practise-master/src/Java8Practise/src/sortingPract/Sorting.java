package sortingPract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
	public static void main(String args[]) {
	
	ArrayList<Integer> al=new ArrayList<>();
	al.add(12);
	al.add(20);
	al.add(21);
	al.add(30);
	Optional<Integer> b=Optional.ofNullable(al.stream().reduce(12,(e1,e2)->e1+e2));
	System.out.print(b.get());
	
	Collections.sort(al,(i1,i2)->-i2.compareTo(i1));
	//Stream<int> a=al.stream().flatMap(i->i+2);
		System.out.println(al);
		
		Optional<Integer> a=al.stream().min((i1,i2)->-i2.compareTo(i2));
		System.out.println(al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()));
		
		System.out.println(a.get());
	
	}
}
