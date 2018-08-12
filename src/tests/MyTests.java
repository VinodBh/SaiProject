package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTests {
	WebDriver d;

	@BeforeMethod
	public void beforeMethod(){

		String proPath = System.getProperty("user.dir");
		System.out.println(proPath);
		System.setProperty("webdriver.chrome.driver", proPath + "\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void afterMehod(){
		d.quit();
	}
	
	@Test
	public void Test1(){
		d.get("https://www.google.com/");
	}
	
	@Test
	public void Test2(){
		d.get("https://www.youtube.com/");
	}
	
	
	@Test
	public void Test4(){
		d.get("http://www.esakal.com/");
	}
	
	
	
	
	
	
}
