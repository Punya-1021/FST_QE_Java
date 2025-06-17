package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestActivity17 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		 driver.manage().window().maximize();
		
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println(driver.getTitle());
		
		Select multilist = new Select(driver.findElement(By.cssSelector("select.h-80")));

		
		multilist.selectByVisibleText("HTML");

		
		for(int i=3;i<=5;i++)
		{
		multilist.selectByIndex(i);
		}

		multilist.selectByValue("nodejs");
		
		multilist.deselectByIndex(4);
		
		
		for(WebElement option : multilist.getAllSelectedOptions())
		{
			System.out.println(option.getText());
		}

		driver.quit();
	}

}
