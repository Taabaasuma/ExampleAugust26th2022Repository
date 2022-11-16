package com.sgteting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AassertEqualsDemo {

	@Test
	public void assertEqualsDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			Assert.assertEquals(s1, s2);
			System.out.println("The AssertEquals step has executed property");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void assertNotEqualsDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1,s2;
			s1="JavaScript";
			s2="JavaScriptNew";
			Assert.assertNotEquals(s1, s2);
			System.out.println("The AssertNotEquals step has Execute properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
