package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

	public static void takeScreenshot(String path, ChromeDriver driver) throws IOException {
	//take screenshot and store in file format
	File f2 = driver.getScreenshotAs(OutputType.FILE);
	//copy screenshot to the desired location using copyfile method.
	FileUtils.copyFile(f2, new File(path + ".jpg"));
	
	
	
	}
	
	
	
	
	
}
