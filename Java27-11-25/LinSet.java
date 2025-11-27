package praccc;

import java.util.*;
public class LinSet {

	public static void main(String[] args) {
		
		System.out.println("Adding in LinkedHashSet");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Piastri");
		set.add("Kimi");
		set.add("Sainz");
		set.add("Norris");
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println();
		System.out.println("Removing");
		
		set.remove("Kimi");
		System.out.println(set);
	}

}
