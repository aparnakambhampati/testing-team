package daym1;

public class Usageofstaticvariable {
	int id;
	String name;
	static String org="ojas";
	public void emp(int i,String n) {
		id=i;
		name=n;
	}
	public void display() {
		System.out.println(id+"   "+name+"   "+org);
		
	}
	
	public static void main(String[] args) {
		Usageofstaticvariable obj=new Usageofstaticvariable();
		obj.emp(1, "appu");
		obj.display();
		
	}

}
