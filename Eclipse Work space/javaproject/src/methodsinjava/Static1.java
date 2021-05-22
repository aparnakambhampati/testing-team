package methodsinjava;
// static method with parameters and with return
public class Static1 {
	public static int add(int a[]) {
		int total=0;
		for(int b:a) {
			total=total+b;
			
		}
		return total;
		
	}
		
	public static void main(String[] args) {
		int x[]= {1,2,3,4};
		int y=add(x);
		System.out.println(y);
		
	}

}
