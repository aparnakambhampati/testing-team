package daym4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2login4 {
 static WebElement  user,pass,login;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak21130\\Desktop\\appu files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		user=driver.findElement(By.name("username"));
		pass=driver.findElement(By.name("password"));
		login=driver.findElement(By.id("login"));
		
		String a[][]= {{"rameshadepu","ramesh"},{"rameshadepu","ramesh"},{"rameshadepu","ramesh"},{"rameshadepu","ramesh"}};
		for(int i=0; i>=a.length;i++) {
			user.sendKeys(a[i][0]);
			pass.sendKeys(a[i][1]);
			login.click();
			driver.close();
		}
			}

			}
		
/*user.sendKeys(a[0][0]);
pass.sendKeys(a[0][1]);
login.click();
driver.close();
user.sendKeys(a[1][0]);
pass.sendKeys(a[1][1]);
login.click();
driver.close();
user.sendKeys(a[2][0]);
pass.sendKeys(a[2][1]);
login.click();
driver.close();
user.sendKeys(a[3][0]);
pass.sendKeys(a[3][1]);
login.click();
driver.close();*/




