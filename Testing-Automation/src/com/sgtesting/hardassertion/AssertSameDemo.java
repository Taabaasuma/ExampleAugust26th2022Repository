package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {

	@Test
	public void assertSameDemo()
	{
		try
		{
			String s1="Welcome";
			String s2=new String("Welcome");
			Assert.assertSame(s1, s2);
			System.out.println("The AssertSame step has Executed properly");
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
			String s1="Welcome";
			String s2=new String("WelcomeNew");
			Assert.assertSame(s1, s2);
			System.out.println("The AssertNotSame step has Executed properly");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
