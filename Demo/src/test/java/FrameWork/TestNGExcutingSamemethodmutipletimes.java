package FrameWork;

import org.testng.annotations.Test;

public class TestNGExcutingSamemethodmutipletimes 
{
	@Test(invocationCount = 3)
	public void createcontact()
	 {
		
		 System.out.println("contact created");
	 }
	@Test
	public void modiflycontact()
	{
		 System.out.println("contact modified");
	}
	@Test
	public void deletcontact()
	{
		 System.out.println("contact deleted");
	}
}
