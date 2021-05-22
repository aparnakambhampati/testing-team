package daym2;

public class Tasl1conoverloading {
	public int sum(int a,int b) {
		int c=a+b;
		
		return c;
	}
	Tasl1conoverloading(){
		System.out.println("welcome");
	}
	public String sum(String s1,String s2) {
		String s=s1+s2;
		return s;
	}

	public static void main(String[] args) {
		Tasl1conoverloading obj=new  Tasl1conoverloading();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum("appu", "hari"));

	}

}
