package dayf24;

import java.util.Scanner;

public class Task1charcount {

	public static void main(String[] args) {

		String s="welcome to ojas";
		System.out.println("enter chracter");
		Scanner sc=new Scanner(System.in);		
		char c=sc.next().charAt(0)	;
		int count = 0;		
		for(int i=1;i<=s.length();i++)
		{			
			if(s.charAt(i)==c) {				
				count++;
			}				

		}
		System.out.println(count);
	}

}





