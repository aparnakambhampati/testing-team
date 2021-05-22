package daym1;

public class Task2methodoverloading {
	public int sum(int a,int b) {
		int c=a+b;
			return c;
		
	}
	public String sum(int a,int b,int c) {
		int d=a+b-c;
		return "aparna";
	}

	public static void main(String[] args) {
		Task2methodoverloading obj=new Task2methodoverloading();
		int x=obj.sum(10, 20);
		String s=obj.sum(20, 10,10);
		System.out.println(x);
		System.out.println(s);
		
		
	}

}
