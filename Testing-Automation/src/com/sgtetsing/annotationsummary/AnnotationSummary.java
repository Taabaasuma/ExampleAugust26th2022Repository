package com.sgtetsing.annotationsummary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSummary {

	@Test
	public void method1()
	{
		System.out.println("This is @test Annotation Method");
	}
	@Test
	public void method2()
	{
		System.out.println("This is @test Annotation method2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is @BeforMethod Annotation method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is @afterMathod Annotation Method");
	}
	@BeforeClass
	public void beforClass()
	{
		System.out.println("This is @BeforeClass Annotation method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is @AfterClass Annotation Method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is @BeforeTest Annotation Method");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is @AfterTest Annotation method");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is @Beforesuite Annotateion method");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is @AfterSuite Annotation method");
	}
	

}
