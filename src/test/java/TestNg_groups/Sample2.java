package TestNg_groups;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void demo4()
	{
		System.out.println("hi demo4");
	}
	
	@Test(groups="smoke")
	public void demo5()
	{
		System.out.println("hi demo5");
	}
	
	@Test
	public void demo6()
	{
		System.out.println("hi demo6");
	}

}
