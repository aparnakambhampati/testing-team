package methodsinjava;
//Non static method with out parameters and with return type
public class Nonstatic3 {
	public int[] getelements() {
		int a[]= {10,23,85,96};
		return a;
	}

	public static void main(String[] args) {
		Nonstatic3 obj=new Nonstatic3();
		int x[]=obj.getelements();
		for(int y:x) {
			System.out.println(y);
			
		}
		
		}
		
		}
		
	


