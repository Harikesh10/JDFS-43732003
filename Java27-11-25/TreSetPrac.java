package praccc;
import java.util.*;
public class TreSetPrac {

	public static void main(String[] args) {
		System.out.println("Adding");
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Hamilton");
		tree.add("Max Verstappen");
		tree.add("Leclerc");
		tree.add("Russell");
		
		System.out.println(tree);
		
		
		Iterator<String> i = tree.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println();
		System.out.println("Removing");
		
		tree.remove("Russell");
		System.out.println(tree);
		
		

	}

}
