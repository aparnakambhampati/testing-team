package package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import package1.Baseclass;
import package2.Flipkartloginpage;

public class Testcases extends Baseclass{

public static void main(String[] args) {
	Testcases  obj=new Testcases();
	Flipkartloginpage obj1=PageFactory.initElements(driver,Flipkartloginpage.class );
	obj.setup("https://www.flipkart.com/");
	obj1.page1login("9381430726", "RameshMani143@");
	
		
	}

	

}
