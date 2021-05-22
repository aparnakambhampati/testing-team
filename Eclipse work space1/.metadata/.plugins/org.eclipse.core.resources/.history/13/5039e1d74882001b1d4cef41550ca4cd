package package2;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package1.Baseclass;

public class Flipkartloginpage extends Baseclass{
	
public Menu menu=null;
public  Flipkartloginpage(WebDriver driver) {
	menu=PageFactory.initElements(driver, Menu.class);
}
		
	
	@FindBy(className = "_1_3w1N")
	
	 WebElement loginclick;
	@FindBy(xpath  ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement username;
	@FindBy(xpath  = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement sub;
	public void page1login(String u,String p) {
		fnclick(loginclick);
		fnsendkeys(username, u);
		fnsendkeys(password, p);
		fnclick(sub);
	}

public static void main(String[] args) {
	
		
	}

}
