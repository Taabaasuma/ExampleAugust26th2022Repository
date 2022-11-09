package com.sgteting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {

	@Test
	public void assertSameDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1="Welcome";
			String s2=new String("Welcome");
			Assert.assertSame(s1, s2);
			System.out.println("The AssertSame step has Executed properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void assertNotSameDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1="Welcome";
			String s2=new String("WelcomeNew");
			Assert.assertSame(s1, s2);
			System.out.println("The AssertNotSame step has Executed properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
