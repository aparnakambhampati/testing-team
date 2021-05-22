package methodsinjava;
//Non static method with parameters and with return
public class Nonstatic1 {
public Boolean com(int a,int b) {
	if(a>b)
		return true;

else {
	return false;
}
	
	
}
	public static void main(String[] args) {
		Nonstatic1 obj=new Nonstatic1();
	boolean x=	obj.com(63, 48);
	System.out.println(x);
		

	}

}
