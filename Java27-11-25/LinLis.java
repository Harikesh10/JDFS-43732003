package praccc;

import java.util.*;

public class LinLis {

	public static void main(String[] args) {
		
		//Adding the elements
		System.out.println("List1");
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hamilton");
		list.add("Verstappen");
		list.add("Leclerc");
		list.add("Russell");
		
		list.add(2,"Norris");
		System.out.println(list);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			}
		System.out.println();
		System.out.println("List2");
		LinkedList<String> list2  = new LinkedList<String>();
		list2.add("Piastri");
		list2.add("Kimi");
		list2.add("Sainz");
		
		list.addAll(list2);
		
		list.addFirst("Alonso");
		list.addLast("Yuki");
		
		System.out.println(list);
		
		Iterator<String> iit =list.iterator();
		while(iit.hasNext()){
			System.out.println(iit.next());
		}
		System.out.println();
		System.out.println("List3");
		
		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("Bearman");
		list3.add("Lawson");
		list3.add("Gasly");
		list3.add("Lawson");
		
		
		
		list.addAll(list3);
		System.out.println(list);
	    list.remove("Lawson");	
	    
		
		System.out.println();
		//Removing the elements
		
		list.remove("Yuki");
		list.remove(0);
		System.out.println(list);
		
		
		
		list.removeAll(list3);
		list.removeLast();
		System.out.println(list);
		
		
		
		//Reverse the list
		
		 Iterator ir=list.descendingIterator(); 
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
