package packgae1;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Abc");
		al.add("xyz");
		al.add("asg:");
		Object[] a=al.toArray();
		
		System.out.println(a.length);
		for(Object s:a) {
			System.out.println(s);
		}
	}

}
