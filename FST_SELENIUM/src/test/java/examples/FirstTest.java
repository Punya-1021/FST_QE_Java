package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	public static void main(String[] args) {
		//Initialization driver
		WebDriver driver = new FirefoxDriver();//it is class name -- FirefoxDriver (but the driver name is "geckodriver"
		
		// Open the browser or page
		driver.get("https://training-support.net/");//put link of that browser
		
		// Page interaction
		//Print the page title
		System.out.println(driver.getTitle());
		
		//Close the browser
		//driver.quit();
	}

}
