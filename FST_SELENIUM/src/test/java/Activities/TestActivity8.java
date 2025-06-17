package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity8 {
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
				 
			Actions builder = new Actions(driver);
			
			
			driver.get(" https://training-support.net/webelements/mouse-events");//put link of that browser
		
			System.out.println(driver.getTitle());
			
			WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
			WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
			WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
			WebElement targetFile = driver.findElement(By.xpath("//h1[text()='target']"));

			
			builder.click(cargoLock).pause(5000).click(cargoToml).build().perform();
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			//double click on the src button. then right click on the target button
			builder.doubleClick(srcFile).pause(5000).contextClick(targetFile).perform();
			
			//Select open
			builder.click(driver.findElement(By.cssSelector("span.ml-3"))).build().perform();
			
			System.out.println(driver.findElement(By.id("result")).getText());

			driver.quit();

		

}
}
