package oppsen;

public class StringBuild {

	public static void main(String[] args) { 
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("World ");
		sb.append("Java");
		System.out.println(sb);
		
	
		StringBuilder sb1 = new StringBuilder("Lionel");
		sb1.insert(4,"Messi");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Lionel");
		sb2.replace(1, 4, "Messi");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("Lionel");
		sb3.delete(1, 4);
		System.out.println(sb3);
		
		StringBuilder sb4 = new StringBuilder("Messi");
		sb4.reverse();
		System.out.println(sb4);
		
		
		
		
		
		
	}

}
