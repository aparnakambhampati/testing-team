package daym1;

public class Task6 {
	public int cls(int id, String name) {
		return id;
		
	}
	public String cls(String ename, String trainer,int id) {
		return ename;
	}

	public static void main(String[] args) {
		Task6 obj=new Task6();
		//obj.cls(101, "appu");
		//obj.cls("appu", "ramesh");
		System.out.println(obj.cls(101, "appu"));	
		System.out.println(obj.cls("appu", "ramesh",101));
		
	}

}
