package dayf24;

public class Task2duplicatearray {

	public static void main(String[] args) {
		String s="hyderabad";
		int count=0;
		char c;
		for(int i=0;i<=s.length();i++) {
			{
				c=s.charAt(i);
				for(int j=i+1;j<=s.length();j++) {
					
				
if(c==s.charAt(j)) {
	System.out.println(c);
	count++;
}
	
}
		
		}
		
		}
	}
}
			
	


