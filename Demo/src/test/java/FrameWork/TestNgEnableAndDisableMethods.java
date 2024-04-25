package FrameWork;

import org.testng.annotations.Test;

public class TestNgEnableAndDisableMethods 
{
	public void createcontact()
	 {
		
		 System.out.println("contact created");
	 }
	@Test(enabled=false)
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
