package com.sgtesting.hardassertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {

	@Test
	public void assertNullDemo()
	{
		try
		{
			File f1=null;
			Assert.assertNull(f1);
			System.out.println("The assertNull step has executed peoperrly");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void assertNotNullDemo()
	{
		try
		{
			File f1=null;
			f1=new File("D:\\EXAMPLE");
			Assert.assertNull(f1);
			System.out.println("The assertNotNull step has executed peoperrly");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
