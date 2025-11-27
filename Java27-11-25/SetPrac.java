package praccc;

import java.util.*;

public class SetPrac {

	public static void main(String[] args) {
		System.out.println("Adding");
		HashSet<String> set = new HashSet<String>();
		set.add("Hamilton");
		set.add("Verstappen");
		set.add("Leclerc");
		set.add("Russell");
		

		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			}
		
		System.out.println();
		System.out.println("Removing");
		set.remove("Russell");
		
		System.out.println(set);
		
	}
	
	

}

       
