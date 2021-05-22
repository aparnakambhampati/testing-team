package daym1;

public class Task3thiskeyword {
	int x=10;
	public void show() {
		int x=20;
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		 Task3thiskeyword obj=new  Task3thiskeyword();
		 obj.show();

	}

}
