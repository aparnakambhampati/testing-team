package daym1;

public class Thiskeyword1 {
	int id;
	String name;
	static String org="ojas";
	public void emp(int id,String name) {
		this.id=id;
		this .name=name;
	}
	public String display() {
		this.emp(101, "appu");
		return id+" "+name+"  "+org;
	}
	
	

	public static void main(String[] args) {
		Thiskeyword1 obj=new Thiskeyword1();
		obj.emp(102, "hari");
		String x=obj.display();
		System.out.println(x);
		
	}

}
