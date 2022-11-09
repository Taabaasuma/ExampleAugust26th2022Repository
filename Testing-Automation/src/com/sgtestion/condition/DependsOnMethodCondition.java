package com.sgtestion.condition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethodCondition {
	
	@Test(priority = 1)
	public void createUser()
	{
		System.out.println("User demoUser1 has created successfully...");
	}
	
	@Test(priority = 2)
	public void modifyUser()
	{
		System.out.println("User demoUser1 has modify successfully....");
	}
	
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("User demoUser1 has delete successfully....");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser,Navigate URL and Login Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LogOut from the Application and Close The Application");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	}
	

}
