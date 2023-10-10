package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieComparableClass {
	public static void main(String args[]) {
		
		ArrayList<Movie> al=new ArrayList<Movie>();
		al.add(new Movie("A",8.9,1995));
		al.add(new Movie("B",1.2,2004));
		al.add(new Movie("Z",9.0,1800));
		al.add(new Movie("K",3.0,2024));
		
		
		Collections.sort(al,
				(i1,i2)->(i1.getYear() > i2.getYear())?1:(i1.getYear()<i2.getYear())?-1:0);
		
		//System.out.println(al);
		for(Movie m:al) {
			System.out.println(m);
		}
	
		//	al.stream().sorted().forEach(System.out::println);
		//al.stream()
		//.sorted(Comparator.comparing(Movie::getRating))
		//.sorted(Comparator.reverseOrder())
		//.forEach(System.out::println);
//		Collections.sort(al);
//		for(Movie m:al) {
//			System.out.println(m);
//		}
	}

}
