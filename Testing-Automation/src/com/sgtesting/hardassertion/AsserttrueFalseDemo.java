package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserttrueFalseDemo {

	@Test
	public void assertTrueDemo()
	{
		try
		{
			int x,y;
			x=75;y=50;
			Assert.assertTrue(x>=y);
			System.out.println("The AssertTrue step has Execute properly");
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
			int x,y;
			x=75;y=50;
			Assert.assertTrue(x<=y);
			System.out.println("The AssertFalse step has Execute properly");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
