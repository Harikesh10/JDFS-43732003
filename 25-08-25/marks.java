package practise_java;
import java.util.Scanner;

public class demo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int mark = scan.nextInt();
		if (mark>80) {
			System.out.println("A grade");
		}
		else if(mark<80 && mark>=60) {
			System.out.println("B grade");
		}
		else if(mark<60 && mark>=50 ){
			System.out.println("C grade");
		}
		else if(mark<50 && mark>=45 ) {
			System.out.println("D grade");
		}
		else if(mark<45 && mark >=25 ) {
			System.out.println("E grade");
		}
		else {
			System.out.println("F grade");
		}
		
	}
}  

