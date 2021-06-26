package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


//encapsulation use?

public class Base {//handling the browser and handling properties file.
	

	public ChromeDriver driver;
	public Properties pr;
	//@paramter("Browser") can be used for paramterisation
	
	
	@BeforeMethod
	public void initialization() throws IOException {
		
		File f=new File("../YTFramework/Object.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void cc() {
		driver.close();
	}
	

	
	
}
