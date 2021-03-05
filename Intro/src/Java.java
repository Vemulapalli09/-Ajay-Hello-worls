import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
				//Selenium Code-
				//Create Driver object for Chrome Browser 
				
				 /* Class name= ChromeDriver,
						 	
						X Driver= New X(); */
		
				
				//invoke .exe file first 
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver= new ChromeDriver();
				driver.get("http://google.com");
				
	}

}
