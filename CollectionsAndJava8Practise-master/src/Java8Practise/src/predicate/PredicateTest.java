package predicate;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String args[]) {
		
		//1.Implementing predicate using an implementation class
		Predicator<Integer> p0=new PredicateImpl();
		System.out.println(p0.test(100));
		System.out.println(p0.test(2));

		// 2.Implementing predicate using anonymous inner class
		Predicate<Integer> p = new Predicate<Integer>() {
			public boolean test(Integer i) {
				if (i > 10) {
					return true;
				} else
					return false;

			}
		};

        //3.Implement predicate with a lambda expression
		Predicate<Integer> p1 = i -> i > 10;
		System.out.println(p1.test(100));
		System.out.println(p1.test(3));
		
		
		

	}
}
