package daym1;

class Task7methodc2 extends Task7methodoverriding{
public int bank(int acc1, int acc2) {
		int acc=acc1+acc2;
		return acc;
}

	public static void main(String[] args) {
		Task7methodc2 obj=new Task7methodc2();
		System.out.println(obj.bank(10,10));
		System.out.println(obj.bank(20,20));
	}

}
