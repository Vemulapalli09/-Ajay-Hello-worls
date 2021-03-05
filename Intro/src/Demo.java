import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Selenium code-
		 
		// Create Driver object for Chrome Browser  
		// Will will strictly implement the methods of webdriver 
		
		/* Class name= CromeDriver
		X driver=new X();	*/
		
		// invoke .exe file first 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
       ChromeDriver driver= new ChromeDriver();
       driver.get("http://google.com");
      System.out.println(driver.getTitle());
		
	}

}
