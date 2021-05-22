package dayf25;
// Create  static and non-static method with parameters and string return type?
public class Task3staticandnonstatic {
	public String name(String a,String b) {
		
		return a;
	}
	public static String city(String c1,String c2) {
		
		return c1;
	}
	

	public static void main(String[] args) {
		Task3staticandnonstatic obj=new Task3staticandnonstatic();
	String x=obj.name("appu", "hari");
	String y=Task3staticandnonstatic .city("hyd", "kmm");
System.out.println(x);
System.out.println(y);
	}

}
