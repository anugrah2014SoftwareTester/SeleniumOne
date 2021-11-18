package tests;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		//Scroll
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,550)");
		
		//Selecting radio button
		
		List<WebElement> radio = driver.findElements(By.xpath("//div[@style='text-align: center']/form/input"));
		
		for(int i=0 ; i<radio.size(); i++)
		{
			System.out.println(radio.get(i).getText());
		}
		radio.get(1).click();
	}
}
