package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestClass_EmailableReport 
{
@Test 
public void m1()
{
	//System.out.println("running test case: m1");
	    Reporter.log("running test case: m1",true);
}

@Test 
public void m2()
{
	//System.out.println("running test case: m2");
	    Reporter.log("running test case: m2",true);
}








}
