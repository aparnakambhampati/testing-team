package daym4;

//  Create script for Adactin login functionality and validate using title, url, is displayed and is enabled?
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Adactinlogin {
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
		String exptitle="Adactin.com - Search Hotel";
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
	if(exptitle.equals(acttitle)) {
		System.out.println("login success");
	}
	else {
		System.out.println("login falid");
		
	}
	String acturl="https://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php";
	String expurl=driver.getCurrentUrl();
	System.out.println(expurl);
	if(acturl.equals(expurl)) {
		System.out.println("valid url");
	}
	else {
		System.out.println("invalid url");
	}
		driver.close();

	}

}
