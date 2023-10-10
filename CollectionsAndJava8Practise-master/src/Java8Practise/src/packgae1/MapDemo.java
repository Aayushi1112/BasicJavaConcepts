package packgae1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String args[]) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("A","Apple");
		map.put("B", "Ball");
		map.putIfAbsent("A","Ant");
		System.out.println(map);
		System.out.println(map.entrySet());
		Set set=map.entrySet();
		System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  and  "+entry.getValue());
		}
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry
				.comparingByKey()).forEach(System.out::println);
		
		
		
	}
}
