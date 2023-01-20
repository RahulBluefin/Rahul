package New_Updates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_elements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info");
		//String p = driver.findElement(By.xpath("(//div[@class='counter-group'])[1]")).getText();
		String p = driver.findElement(By.xpath("(//span[@class='rts-counter'])[1]")).getText();
		System.out.println("Current World Population is = " +p);
		
		driver.get("https://www.worldometers.info/coronavirus/");
		String CC = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println("Coronavirus Cases: = " +CC);
		
		String RC = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println("Recovered: = " +RC);
		
	}

}
