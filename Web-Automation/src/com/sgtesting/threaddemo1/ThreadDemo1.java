package com.sgtesting.threaddemo1;
class MyThread implements Runnable
{
	public void run()
	{
		displayOddNumbers();
	}
	void displayOddNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==1)
				{
					System.out.println("Odd No:"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread job=new  MyThread();
		
		Thread t=new Thread(job);
		t.start();

	}

}
