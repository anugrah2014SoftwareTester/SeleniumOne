package tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		File f = new File("C:\\testing\\temp1.txt");
		f.createNewFile();
		
		driver.get("https://www.amazon.com/b?ie=UTF8&node=16008589011");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> searchresult = driver.findElements(By.xpath("//div[@id='suggestions']/div"));
		//System.out.println(searchresult);
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter out = new BufferedWriter(fw);
		for(int i=0; i < searchresult.size() ; i++)
		{
			//System.out.println(searchresult.get(i).getText());
			
		    String storesearch = searchresult.get(i).getText();
		    fw.write(storesearch);
		}
		
		
		
		
		
	}

}
