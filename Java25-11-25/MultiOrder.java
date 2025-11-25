package oppsen;

public class MultiOrder {

	public static void main(String[] args) {
		Numeric num = new Numeric();
		Alpha alp = new Alpha();

		// start the thread
		num.start();
		try{
			num.join();
		}
		catch(Exception e){
			System.out.println("Some bullshit error");
			
		}
		alp.start();
	}
}
class Numeric extends Thread {
	int a = 0;

	public void run() {

		try {
			for (int i = 0; i <= 10; i++) {
				a++;
				System.out.println("Numeric Thread : " + a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Alpha extends Thread {
	char a = 'A';

	public void run() {
		try {
			for (int i = 0; i <= 25; i++) {

				System.out.println("Alpha Thread : " + a);
				a++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
