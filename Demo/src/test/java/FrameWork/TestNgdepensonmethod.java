package FrameWork;

import org.testng.annotations.Test;

public class TestNgdepensonmethod 
{
	//if independent passed then depends methods also passed
	//if independent method is fauled then dependent methods will skipped
	@Test(priority=1)	
	 public void createcontact()
	 {
		
		 System.out.println("contact created");
	 }
	@Test(dependsOnMethods ="createcontact")
	public void modiflycontact()
	{
		 System.out.println("contact modified");
	}
	@Test(dependsOnMethods ="createcontact")
	public void deletcontact()
	{
		 System.out.println("contact deleted");
	}
}
