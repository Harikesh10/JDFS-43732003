package nextProg;
public class MathOper {
	public static void main(String[] args){
		Marks m = new Marks(25);
		m.add();
		
}
}
class Marks{
	int marks = 90;
		protected void add(){
		int result = marks*100;
		System.out.println(result);
		//Yes we can create a class inside a method
		class InsiderClass{
			void div(){  	
				System.out.println("The method inside the local class");
			}
		}
		InsiderClass i = new InsiderClass();
		i.div();
		
	}
	
	{
		System.out.println("Hello Java!");
		String date = "19th Nov";
		System.out.println(date);
		
	}
	public Marks(){
		System.out.println("This is a default const");
	}
	public Marks(int a){
		//Use to print the default constructor
		this();
		a = marks+a;
		System.out.println(a);
	
	
}
}
