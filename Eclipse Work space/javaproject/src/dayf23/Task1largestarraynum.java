package dayf23;

import java.util.Arrays;

public class Task1largestarraynum {

	public static void main(String[] args) {
		int a[]= {30,53,21,1028,99};
		int large=Arrays.stream(a).max().getAsInt();
		System.out.println("largest num in given num"+large);
	}

}
