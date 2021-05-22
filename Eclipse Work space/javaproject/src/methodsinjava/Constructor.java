package methodsinjava;

public class Constructor {
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	Constructor(){
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		obj.sum(10, 20);
}
}
