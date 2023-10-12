package TestNg_groups;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("hi demo1");
	}
	
	@Test(groups="smoke")
	public void demo2()
	{
		System.out.println("hi demo2");
	}
	
	@Test
	public void demo3()
	{
		System.out.println("hi demo3");
	}

}
