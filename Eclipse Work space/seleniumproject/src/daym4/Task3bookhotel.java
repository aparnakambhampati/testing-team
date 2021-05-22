package daym4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3bookhotel {
	static WebElement user,pass,login;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak21130\\Desktop\\appu files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/HotelAppBuild2/");
		user=driver.findElement(By.name("username"));
		pass=driver.findElement(By.name("password"));
		login=driver.findElement(By.id("login"));
		user.sendKeys("rameshadepu");
		pass.sendKeys("ramesh");
	System.out.println(	pass.getAttribute("value"));
		login.click();
		Select st=new Select(driver.findElement(By.name("location")));
		st.selectByIndex(6);
		Select st1=new Select(driver.findElement(By.id("hotels")));
		st.selectByIndex(2);
		Select st2=new Select(driver.findElement(By.id("room_type")));
		st.selectByIndex(2);
		Select st3=new Select(driver.findElement(By.id("room_type")));
		st.selectByIndex(2);
	}

}
