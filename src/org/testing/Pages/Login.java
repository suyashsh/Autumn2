package org.testing.Pages;

import java.awt.Robot;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	
	
	public Login(ChromeDriver driver, Properties pr)//this is parameterised constructor
	{
		this.driver=driver;
		this.pr=pr;
	
//this keyword use to refer global variables
	}
	

	
	
	

	public void sign(String username, String password) throws InterruptedException
	{
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));//comes from object.properties
		signin.click();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath(pr.getProperty("em")));
		email.sendKeys(username);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		//WebDriverWait wait =new WebDriverWait(getWebDriver(),10).until(ExpectedConditions.elementToBeClickable(By.xpath(pr.getProperty("next"))));
//		WebElement nx=driver.findElement(By.xpath(pr.getProperty("next")));
//		
//		js.executeScript("arguments[0].scrollIntoView(true)",nx);
//		
//		nx.click();
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("PASS")));
		pass.sendKeys(password);
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
//		WebElement Next=driver.findElement(By.xpath(pr.getProperty("NEXT")));
//		Next.click();

	}
	
}
