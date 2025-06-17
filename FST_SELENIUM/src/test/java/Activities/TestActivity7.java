package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity7 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://training-support.net/webelements/dynamic-controls");//put link of that browser
	
		System.out.println(driver.getTitle());
		
		WebElement textBox = driver.findElement(By.id("textInput"));
		   System.out.println(textBox.isEnabled());
		   

		   driver.findElement(By.id("textInputButton")).click();
		   System.out.println(textBox.isEnabled());
	   
			driver.quit();

		
	}

}
