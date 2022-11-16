package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {

	@Test
	public void createProduct()
	{
		System.out.println("User demoProduct1 has created successfully...");
	}
	
	@Test
	public void modifyProduct()
	{
		System.out.println("User demoProduct1 has modify successfully....");
	}
	
	@Test
	public void deleteProduct()
	{
		System.out.println("User demoProduct1 has delete successfully....");
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
