package oppsen;

public class Strin {

	public static void main(String[] args) {
		
	 String s1 = "Hello javaboi";
     char c[] = {'a','b','c','d','e','f'};
     String s2 = new String(c);
     
     String s3 = new String("Hello pythonboi");
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
		
	String s4 = "Lionel Messi";
	System.out.println(s4);
	System.out.println(s4.toUpperCase());
	System.out.println(s4.toLowerCase());
		
		
		String s5 = "  ronaldo ";
		String s6 = s5.trim();
		System.out.println(s5);
		System.out.println(s6);
		
		
		String s7 = "Neymar";
		System.out.println(s7.startsWith("Ney"));
		System.out.println(s7.endsWith("a"));
		
		String s8 = "Neymar";
		System.out.println(s8.charAt(3));
		
		System.out.println(s8.length());
		
		
		String s9 = new String("Hamilton");
		String s10 = s9.intern();
	    System.out.println(s10);
		
		int a=69;
		String s11=String.valueOf(a);
		System.out.println(s11+420);
		
		
		String s12 = "Max is the goat of f1, Max is the world champion";
		String s13 = s12.replace("Max", "Hamilton");
		System.out.println(s13);
		
		
		String s14 = "Lewis ";
		String s15 = "Hamilton";
		String s16 = s14.concat(s15);
		System.out.println(s16);
		
		String s17="Messi";
		String s18="Messi";
		String s19=new String("Messi");
		String s20="Ronaldo";
		System.out.println(s17.equals(s18)); 
		System.out.println(s17.equals(s19)); 
		System.out.println(s17.equals(s20)); 
		
		String s21="Messi";
		String s22="Messi";
		String s23=new String("Messi");
		System.out.println(s21==s22); 
		System.out.println(s21==s23);// It create a different location in the memory , so the memory size is different

		String s24="Sachin";
		String s25="Sachin";
		String s26="Ratan";
		System.out.println(s24.compareTo(s25));//0
		System.out.println(s25.compareTo(s26));//1(because s1>s3)
		System.out.println(s26.compareTo(s24));//-1(because
		
		
		
		
		
		
		
	    
		
		
		
		
		
	}

}
