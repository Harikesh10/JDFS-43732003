package praccc;
import java.util.*;
public class HasMa {

	public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"1@.");   
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   map.put(1, "Muskmelon");
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  

	}

}
