package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class ReflectionWithParameterDemo {

	public static void main(String[] args) {
		

	}
	
	private static void executeDemo()
	{
		CustomerDetails obj=null;
		try
		{
			obj=new CustomerDetails();
			//Parameter for two String Parameter
			Class strparam1[]=new Class[2];
			strparam1[0]=String.class;
			strparam1[1]=String.class;
			
			Method method1=obj.getClass().getMethod("getPersionDetails", strparam1);
			method1.invoke(obj, new String("Sachin"),new String("Mumbai"));
			
			//parameter of Integer type
			Class intparam1[]=new Class[1];
			intparam1[0]=Integer.TYPE;
			
			Method method2=obj.getClass().getMethod("diaplayEmployeeDtails", intparam1);
			method2.invoke(obj, 7210);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
