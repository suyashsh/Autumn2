package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 extends Base {
	
//public WebDriver driver;
//	
//	@BeforeMethod
//	public void initialization() throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver","..//YTFramework/chromedriver.exe");
//	
//        driver=new ChromeDriver();
//	    driver.get("http://www.youtube.com");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		
//	}
	
	@Test
	public void tc() throws InterruptedException {
		
		WebElement signin=driver.findElement(By.xpath("//paper-button[@id='button' and @class='style-scope ytd-button-renderer style-suggestive size-small']"));
		signin.click();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("suyashfintech@gmail.com");
		WebElement login=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		login.click();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password' and @class='whsOnd zHQkBf']"));
		password.sendKeys("suyash@123");
		Thread.sleep(3000);
		WebElement Next=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		Next.click();

		Thread.sleep(3000);
		WebElement watchlater=driver.findElement(By.xpath("(//paper-item[@role='tab' and @class='style-scope ytd-guide-entry-renderer'])[6]"));
		watchlater.click();
		Thread.sleep(6000);
		
		WebElement signout=driver.findElement(By.xpath("//button[@id='avatar-btn']"));
		signout.click();
	    Thread.sleep(3000);
	
		WebElement logout=driver.findElement(By.xpath("(//paper-item[@role='link'])[5]"));
		logout.click();
		Thread.sleep(3000);

	}
	
	
////	@AfterMethod
//	public void cc() {
//		driver.close();
//	}
}
