package day1f22;

import java.util.Scanner;

public class Task1evenorodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}

	}

}
