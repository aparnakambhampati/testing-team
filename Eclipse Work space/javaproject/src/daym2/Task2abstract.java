package daym2;
//2. Create abstract class with static, abstract, non-abstract and final method 
//and implement abstract method in another class?
public   abstract class   Task2abstract {
	
	final int g=10;
		final int h=2;
	
public static void sum(int a, int b) {

	int c=a+b;
		System.out.println(c);
		
		
	}
	public abstract void sub(int i, int j);
	
		
	
	public void mul(int t,int s) {
		int z=t*s;
		System.out.println(z);
		
	}
	public final void div( int g, int h) {
		int x=g/h;
		
	}
	public static void main(String[] args) {
		

	}

}
