package oppsProg;

public class OppInh {
	public static void main(String[] args) {
             Son1 s1 = new Son1();
             s1.oldBike();
             System.out.println(s1.gBike);
             Son2 s2 = new Son2();
             s2.oldBike();
             s2.bike();
	}
}

class GrandFather{
	String gBike = "Masss bike";
	void oldBike(){
		System.out.println("Royal Enfield 1983");
	}
	void property(){
		System.out.println("Gold");
	}
	private void ProSecret(){
		System.out.println("Land");
	}
}

class Father extends GrandFather{
	//Overriding
	void oldBike(){
		System.out.println("Royal Enfield 2002");
		super.oldBike();
		//Private class can't access
//		super.ProSecret();
		
		property();
	}
}

class Son1 extends Father{
	void bike(){
		System.out.println("KTM 390");
	}
}

class Son2 extends GrandFather{
	void bike(){
		System.out.println("RC KTM 390");
	}
}
