package Activities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtraExample2 {
	public static void main(String[] args) {
		
	//Initialize driver
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//initialize Action object
			Actions builder = new Actions(driver);
			
			//open the browser or page
			driver.get("https://training-support.net/webelements/sliders");
			
			//to maximize the window size
			driver.manage().window().maximize();
			
			//print the text of 50%
			WebElement volumeValue = driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
			System.out.println(volumeValue.getText());
			
			//fined the ruler
			WebElement slider = driver.findElement(By.id("volume"));
			
			//move to 25% and print the text
			builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120, 0).release().build().perform();
			//print the value
			System.out.println(volumeValue.getText());
			
			//move to 75% and print the text
			builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120, 0).release().build().perform();
			System.out.println(volumeValue.getText());
			
			driver.quit();
}
		

}
