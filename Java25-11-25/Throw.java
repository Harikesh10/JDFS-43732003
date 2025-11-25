package oppsen;
import java.util.*;
public class Throw {
	
	public void checkAge(int age){
	      if(age<18)
	         throw new ArithmeticException("Not Eligible for voting");
	      else
	         System.out.println("Eligible for voting");
	   }


	public static void main(String[] args) {
		Throw t = new Throw();
		System.out.println("Enter your age: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		t.checkAge(age);
		
	}

}
