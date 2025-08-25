package practise_java;
import java.util.Scanner;

public class demo2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int length = scan.nextInt();
		System.out.print("Enter the breadth: ");
		int breadth = scan.nextInt();
		
		if (length!=breadth) {
			System.out.println("It is a rectangle");
			System.out.println("It is not a square");
		}
		else if(length == breadth) {
		    System.out.println("It is a Square");	
		}
		else {
			System.out.println("Enter the right length and breadth");
		}
		
	}
	

}
