package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NumbersEvenandGreater {
	
	public static void  main(String args[]) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(13);
		l.add(7);
		l.add(12);
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		Predicate<Integer> p3=i->i<30;
		//System.out.println(p1.and(p2).test(21));
		for(int i:l) {
			if(p1.and(p2).and(p3).test(i)){
				System.out.println(p1.and(p2).and(p3).test(i) +""+i);
			}
		}
	
		
	} 

}
