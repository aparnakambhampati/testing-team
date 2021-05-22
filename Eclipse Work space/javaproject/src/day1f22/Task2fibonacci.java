package day1f22;

import java.util.Scanner;

public class Task2fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=0,n2=1,n3,count=sc.nextInt(),i;
		System.out.println(n1+""+n2);
		for(i=2;i<=count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
