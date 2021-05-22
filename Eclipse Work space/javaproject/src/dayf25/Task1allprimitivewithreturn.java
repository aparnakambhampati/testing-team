package dayf25;
// Create methods with all primitive data types return ?

public class Task1allprimitivewithreturn {
	public int add(int i,int j) {
		int c=i+j;
		System.out.println(c);
		return c;
	}
	public float sub(float f1,float f2) {
		float f=f1-f2;
		System.out.println(f);
		return f;
	}
	public double sub(double d1,double d2) {
		double d=d1-d2;
		System.out.println(d);
		return d;
	}
	public String std(String s1,String s2) {
		String s=s1+s2;
		System.out.println(s);
		return s;
	}
		
	

	public static void main(String[] args) {
		Task1allprimitivewithreturn obj=new Task1allprimitivewithreturn();
		obj.add(10, 20);
		obj.sub(22.22, 11.11);
		obj.sub(56.12, 56.11);
		
		
	}

}
