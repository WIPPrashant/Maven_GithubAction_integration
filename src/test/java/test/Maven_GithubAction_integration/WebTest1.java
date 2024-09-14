package test.Maven_GithubAction_integration;

import org.testng.annotations.Test;

public class WebTest1 {
	
	@Test(priority=1)
	public void Test1() {
		System.out.println("test case passed");
	}
	
	@Test(priority=2)
	public void Test2() {
		System.out.println("test case fail");
	}
	
	@Test(priority=3)
	public void Test3() {
		System.out.println("test case skiped");
	}
	@Test(priority=4)
	public void Test4() {
		System.out.println("test case skiped");
	}

}
