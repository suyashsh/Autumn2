package org.testing.TestScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC1 extends Base {//that is the use of the inheritance.
	
	
	//public WebDriver driver;
	
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
	public void tc() throws InterruptedException, IOException {
		
		Login lg=new Login(driver, pr);
		lg.sign("suyashfintech@gmail.com", "suyash@123");
		
		String expectedurl = "https://www.youtube.com/";
		
		
		//has a relationship
		//we can call using class name
		
		Assert. assertEquals(driver.getCurrentUrl(),expectedurl);//This is example of hard assertion.
		
		ScreenshotCapture.takeScreenshot("../YTFramework/screenshots", driver);
		
		Logout lo=new Logout(driver,pr);
		lo.logout();
		
		LogsCapture.takeLog("run sucessfully", "TC1");


		
		
		
		
		
//		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));//comes from object.properties
//		signin.click();
//		Thread.sleep(3000);
//		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("suyashfintech@gmail.com");
//		WebElement login=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
//		login.click();
//		Thread.sleep(3000);
//		WebElement password=driver.findElement(By.xpath("//input[@type='password' and @class='whsOnd zHQkBf']"));
//		password.sendKeys("suyash@123");
//		Thread.sleep(3000);
//		WebElement Next=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
//		Next.click();

//	needs to be done
// Thread.sleep(3000);
//		WebElement trending=driver.findElement(By.xpath("(//paper-item[@role='tab' and @class='style-scope ytd-guide-entry-renderer'])[2]"));
//		trending.click();
//		Thread.sleep(3000);
		
//		WebElement signout=driver.findElement(By.xpath("//button[@id='avatar-btn']"));
 //		signout.click();
//	    Thread.sleep(3000);
//	
//		WebElement logout=driver.findElement(By.xpath("(//paper-item[@role='link'])[5]"));
//		logout.click();

	}
	
	
//	@AfterMethod
//	public void cc() {
//		driver.close();
//	}
	
}