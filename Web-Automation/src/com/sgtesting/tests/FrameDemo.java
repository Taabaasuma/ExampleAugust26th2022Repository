package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		 launchBrowser();
		 navigate();
		 handleFrame();

	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.die");
			System.setProperty("webdriver.chrome.driver","E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void handleFrame()
	{
		try
		{
			//index of the frame
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			//name of the frame
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oFrame=oBrowser.findElement(By.className("rightIframe"));
			//WebElement of the frame
			oBrowser.switchTo().frame(oFrame);
			String textcontent=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/div")).getText();
			System.out.println(textcontent);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
