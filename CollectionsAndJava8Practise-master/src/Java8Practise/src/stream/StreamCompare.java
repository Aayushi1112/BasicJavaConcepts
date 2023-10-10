package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCompare {
	
	public static void main(String args[]) {
	
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(12);
	System.out.println(al);
	
			Boolean a=al.stream().allMatch(i->i>9);
			System.out.println(a);
			List<Integer> li=al.stream().dropWhile(i->i>10).collect(Collectors.toList());
			System.out.println(li);
			

}
}