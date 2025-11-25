package oppsen;

public class StringBuff {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("World ");
		sb.append("Java");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Lionel");
		sb1.insert(4,"Messi");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Lionel");
		sb2.replace(1, 4, "Messi");
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("Lionel");
		sb3.delete(1, 4);
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("Messi");
		sb4.reverse();
		System.out.println(sb4);

	}

}
