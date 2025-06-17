package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity3 {
	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();//it is class name -- FirefoxDriver (but the driver name is "geckodriver"
		
		// Open the browser or page
		driver.get(" https://training-support.net/webelements/login-form");//put link of that browser
		
		// Page interaction
		//Print the page title
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");	//(if we want to search one element we can do like this)
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		
		
		driver.findElement(By.xpath("//button[text()='Submit]")).click();
		
		String message = driver.findElement(By.xpath("//h1[contains(@class, 'text-emerald-500')]")).getText();
		System.out.println(message);

		
		
		//Close the browser
		//driver.quit();
	}

	}


