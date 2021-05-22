package voyaah;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
// TC_02_Verify if user is able to click on About Us page
public class Vooyahtc2 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak21130\\Desktop\\appu files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web-int.stg.voyaah.com/#/");
		driver.manage().window().maximize();

	}
	@Test
	public void click() {
		WebElement x=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-homepage/ion-header/header/nav/ul/li[2]/a"));
		x.click();
	}
}
