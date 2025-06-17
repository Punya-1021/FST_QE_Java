package Activities;

	import java.time.Duration;

import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class TestActivity11 {
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();//it is class name -- FirefoxDriver (but the driver name is "geckodriver"
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			
			// Open the browser or page
			driver.get("https://training-support.net/webelements/dynamic-controls");//put link of that browser
			driver.manage().window().maximize();
			
			
			// Page interaction
			//Print the page title
			System.out.println(driver.getTitle());
			
			//Find the checkbox on page
			WebElement checkBox = driver.findElement(By.id("checkbox"));
			
            //click the "Toggle checkbox" button to remove the checkbox
			driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
			
			//wait for the checkbox to dissapear
            wait.until(ExpectedConditions.invisibilityOf(checkBox));
            
              //Toggle checkbox again
			  driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
			  
			 // Wait for it appear and then select it
	            wait.until(ExpectedConditions.visibilityOf(checkBox));
	            
	            checkBox.click();

		   
			
			//Close the browser
			driver.quit();
		}

	}



