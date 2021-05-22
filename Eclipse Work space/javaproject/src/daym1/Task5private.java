package daym1;

public class Task5private {
	private int i=10;
	public int j=100;
	
	public String org(String name,String city) { 
		return name;
		
	}
	

	public static void main(String[] args) {
		Task5private obj=new Task5private();
		System.out.println(obj.org("appu", "hyd"));
		System.out.println(obj.i);
	}

}
