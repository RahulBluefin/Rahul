package New_Updates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main (String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\RAHUL\\Documents\\webtable.html"); 
		String h1 = driver.findElement(By.xpath("//th[text()='Company']")).getText();
		System.out.println(h1);
		
		//print row
		String row = driver.findElement(By.xpath("(//tr)[2]")).getText();
		System.out.println(row);
		
	}

}
