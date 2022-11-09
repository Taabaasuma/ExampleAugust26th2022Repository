package com.sgteting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserttrueFalseDemo {

	@Test
	public void assertTrueDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			int x,y;
			x=75;y=50;
			Assert.assertTrue(x>=y);
			System.out.println("The AssertTrue step has Execute properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void assertFalseDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			int x,y;
			x=75;y=50;
			Assert.assertTrue(x<=y);
			System.out.println("The AssertFalse step has Execute properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
