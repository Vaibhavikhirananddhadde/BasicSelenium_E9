package TestNg;

import org.testng.annotations.Test;

public class Priority_invocation_Enabled {
	@Test(priority=3,invocationCount=2)
	public void demo1()
	{
		System.out.println("hii demo1");
	}
	
	@Test(priority=-1)
	public void demo2()
	{
		System.out.println("hii demo2");
	}
	
	@Test(priority=-4,invocationCount=2)
	public void demo3()
	{
		System.out.println("hii demo3");
	}
	
	@Test
	public void demo4()
	{
		System.out.println("hii demo4");
	}
	
	@Test(priority=-1,invocationCount=2,enabled=true)
	public void demo5()
	{
		System.out.println("hii demo5");
	}

}
