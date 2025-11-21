package TheOver;



class Animal{
	void sound(){
		System.out.println("Animal shouts");
	}
}

class Dog extends Animal{
	void sound(){
		System.out.println("Barking");
	}
}

class Cat extends Animal{
	void sound(){
		System.out.println("Meowing");
	}
}
public class TheOverRide {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		
		Animal b = new Cat();
		b.sound();
		
		
		
		
		

	}

}
