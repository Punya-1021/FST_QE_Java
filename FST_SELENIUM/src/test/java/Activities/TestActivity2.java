package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity2 {
	public static void main(String[] args) {
		//Initialization driver
		WebDriver driver = new FirefoxDriver();//it is class name -- FirefoxDriver (but the driver name is "geckodriver"
		
		// Open the browser or page
		driver.get(" https://training-support.net/webelements/login-form");//put link of that browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Page interaction
		//Print the page title
		System.out.println(driver.getTitle());
		
		//Find the user name and passwords fields
		//WebElement usernameField = driver.findElement();Do not do like ths because searching for one elemnt we did object creation ,,,it will lead to more memory location 
		driver.findElement(By.id("username")).sendKeys("admin");	//(if we want to search one element we can do like this)
		driver.findElement(By.id("password")).sendKeys("password");
		
		//Find the submit button and click it
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();//(Finding specific one -- use tag name and class name)
		
		
		//Find the success message
		String message = driver.findElement(By.tagName("h1")).getText();//get X method will get the txt from child element also

		System.out.println(message.equals("Login Success!"));
		//Close the browser
		driver.quit();
	}

}
