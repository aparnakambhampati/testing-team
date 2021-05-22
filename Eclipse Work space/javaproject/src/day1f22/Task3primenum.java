package day1f22;

import java.util.Scanner;

public class Task3primenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i,m=0,flag=0,n=sc.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println("n is prime");
		}
		else {
			for(i=2; i<=m;i++) {
				if(n%i==0) {
					System.out.println("n is not prime");
					flag=1;
					break;
				}
				}
			if(flag==0) {
				System.out.println("not a prime");
			}
			
				}
			}
		
		

	}


