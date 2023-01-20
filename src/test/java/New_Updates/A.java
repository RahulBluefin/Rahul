package New_Updates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	public static void main(String[] args) {
		
	
		
		/*	System.setProperty(null, null);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		*/
		
		WebDriverManager.chromedriver().setup(); // setup() - it only opens browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
	//	WebDriver driver = WebDriverManager.chromedriver().create(); // Create() - open & closes browser
	//	driver.get("https://www.flipkart.com/");
		
		
		
	}
}

	

