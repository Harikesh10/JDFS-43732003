package TheOver;
import java.util.*;

public class Excep {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        try{
        	System.out.println(a/b);
        }
        catch(ArithmeticException e){
        	System.out.println("You made a mistake!");
        	a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a/b);
            
        	
        
        }
        
    }
}


