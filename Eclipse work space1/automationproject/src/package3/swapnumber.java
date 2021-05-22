package package3;

public class swapnumber {
	int a=3;
	int b=4;
	public void sum() {
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println(a);
	System.out.println(b);
	}
	

	public static void main(String[] args) {
		swapnumber obj=new swapnumber();
		obj.sum();
	}

}
