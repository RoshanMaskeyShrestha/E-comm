package practise;

import org.testng.annotations.Test;

public class Sample2Test {
	@Test(groups = "regression")
	public void simple() {
		System.out.println("regression");
		
	}
	@Test(groups = "smoke")
	public void createsmoke() {
		System.out.println("smoke");
		
	}

}
