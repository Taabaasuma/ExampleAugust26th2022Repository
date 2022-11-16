package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AassertEqualsDemo {

	@Test
	public void assertEqualsDemo()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			Assert.assertEquals(s1, s2);
			System.out.println("The AssertEquals step has executed property");
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
			String s1,s2;
			s1="JavaScript";
			s2="JavaScriptNew";
			Assert.assertNotEquals(s1, s2);
			System.out.println("The AssertNotEquals step has Execute properly");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
