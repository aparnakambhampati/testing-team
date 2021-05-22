package dayf23;

import java.util.Arrays;

public class Task1arraysmallnum {

	public static void main(String[] args) {
		int a[]= {30,53,21,1028,99};
		int small=Arrays.stream(a).min().getAsInt();
		System.out.println("largest num in given num"+small);
	}

}
