package com.sgtesting.assignment;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemo3 {
	public static WebDriver oBrowser=null;

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void minimizeFlyOutwindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void user1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("v");
			oBrowser.findElement(By.name("lastName")).sendKeys("vin");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("12345a");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345a");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void user2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("s");
			oBrowser.findElement(By.name("lastName")).sendKeys("sam");
			oBrowser.findElement(By.name("email")).sendKeys("sam@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("password")).sendKeys("123321");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123321");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void user3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("s");
			oBrowser.findElement(By.name("lastName")).sendKeys("niki");
			oBrowser.findElement(By.name("email")).sendKeys("niki@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("password")).sendKeys("121212");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("121212");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void loginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345a");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void loginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("123321");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void loginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("121212");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secontimeLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345a");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("vini");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vini");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeLogoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("123321");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("sam");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sam");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeLogoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("121212");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("niki");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("niki");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeLogoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void modifiedLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vini");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logoutModifieduser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void modifiedLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sam");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logoutModifieduser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void modifiedLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("niki");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void logoutModifieduser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeadminLogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void adminModifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("vinayak");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vinayak");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("sami");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sami");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("nikki");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("nikki");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void secondtimeAdminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}	
	public static void thirdtimeLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vinayak");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeuser1logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sami");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeuser2logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("nikki");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeuser3logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeadminLogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void deleteUesers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void thirdtimeAdminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void closeBrowser()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}




}
