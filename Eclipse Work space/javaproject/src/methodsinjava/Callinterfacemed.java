package methodsinjava;

public class Callinterfacemed {

	public static void main(String[] args) {
		webdriver obj=new Chromedriver();
		webdriver obj1=new Interfacecls1();
		obj.login();
		obj.logout();
		obj1.click();
		obj1.clear();

	}

}
