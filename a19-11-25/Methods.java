package startProg;

public class JavaProg {
	
    
	String a = "Harikesh";
    void Lambo() {
        System.out.println("Lamborghini is my fav car!!!");
    }

    public static void main(String[] args) {
        Cars c = new Cars();
        c.por();
        System.out.println(c.name);
        
        JavaProg j = new JavaProg();
        j.Lambo();
        System.out.println(j.a);
        
    }
}

class Cars {
    String name = "Porsche";
    void por() {
        System.out.println("Porsche 911");
    }
}




