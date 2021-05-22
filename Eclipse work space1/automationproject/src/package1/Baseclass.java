package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public void setup(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak21130\\OneDrive - Ojas Innovative Technologies Pvt Lt\\Desktop\\appu files\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);
	}
	public void teardown() {
		driver.close();
		
	}
	public void fnclick(WebElement w) {
		w.click();
		
	}
	public void fnsendkeys(WebElement w, String data) {
		w.sendKeys(data);
	}

	public static void main(String[] args) {
		//Baseclass obj=new Baseclass();
		//obj.setup();
		
	}

}
