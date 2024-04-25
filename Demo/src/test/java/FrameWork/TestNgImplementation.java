package FrameWork;

import org.testng.annotations.Test;

public class TestNgImplementation 
{
@Test(priority=1)	
 public void createcontact()
 {
	 System.out.println("contact created");
 }
@Test(priority=0)
public void modiflycontact()
{
	 System.out.println("contact modified");
}
@Test(priority=-1)
public void deletcontact()
{
	 System.out.println("contact deleted");
}
}
