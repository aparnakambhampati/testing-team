package methodsinjava;
//Non static method with parameters and with out return
public class Nonstatic2 {

	public  void cube(int a) {
		int b=a*a*a;
		System.out.println(b);
		
		
	}
	public static void main(String[] args) {
		 Nonstatic2 obj=new Nonstatic2();
		 obj.cube(5);
		
	}

}
