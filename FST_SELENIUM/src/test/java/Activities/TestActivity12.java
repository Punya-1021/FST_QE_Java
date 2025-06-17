package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity12 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-content");//put link of that browser
	
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("genButton")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
		
		System.out.println(driver.findElement(By.id("word")).getText());
		   

			driver.quit();

		
	}

}



