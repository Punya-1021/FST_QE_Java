package Activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity15 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name-')]")).sendKeys("Some Name"); //starts-with is used to find first word
		
		driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("name@example.com");
		
		driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2025-06-19");
		
		driver.findElement(By.xpath("//textarea[contains(@id, '-additional-datails-')]")).sendKeys("Some random activity");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		System.out.println(message);
		
		
		driver.quit();



}
}
