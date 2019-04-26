package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void test1() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mona\\eclipse-workspace\\Photon\\JenkinsDemo\\driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		
		String title=driver.getTitle();
		
		System.out.println("Title of the page is :"+title);
		
		driver.findElement(By.xpath("//a[.='Documentation']")).click();
		
		System.out.println("Title of Documentation is : "+driver.getTitle());
		
		driver.close();
	}

}
