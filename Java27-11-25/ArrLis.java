package praccc;


import java.util.*;

public class ArrLis {

	public static void main(String[] args) {
		ArrayList<String> Dapa = new ArrayList<String>();
		Dapa.add("Messi");
		Dapa.add("Neymar");
		Dapa.add("Ronaldo");
		Dapa.add("Pessi");
		
		System.out.println(Dapa);
		
		Iterator it = Dapa.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
