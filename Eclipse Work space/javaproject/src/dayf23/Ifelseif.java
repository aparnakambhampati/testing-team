package dayf23;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int i=sc.nextInt();
		if(i>=15 && i<=30) {
			System.out.println("fail");
		}
		else if(i>=30 && i<=60){
			System.out.println("pass");
		}
		else if(i>=60 && i<=80) {
			System.out.println("A gread");
		}
		
}
}
