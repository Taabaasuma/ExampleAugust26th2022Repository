package com.sgteting.softassertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {

	@Test
	public void assertNullDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			File f1=null;
			Assert.assertNull(f1);
			System.out.println("The assertNull step has executed peoperrly");
			obj.assertAll();
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
			SoftAssert obj=new SoftAssert();
			File f1=null;
			f1=new File("D:\\EXAMPLE");
			Assert.assertNull(f1);
			System.out.println("The assertNotNull step has executed peoperrly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
