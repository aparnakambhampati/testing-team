package daym1;

public class Vichele {
	 void run(){
		 System.out.println("Vehicle is running");
		 }  
	
	// class Bike extends Vichele{  
		//	void run(){
			//	System.out.println("bike is running");
			//}
		//}
	
	  public static void main(String args[]){  
	   
	  Bike obj = new Bike();  
	    
	  obj.run();  
	  }  
	}  
	class Bike extends Vichele{  
		void run(){
			System.out.println("bike is running");
		}
	}
	