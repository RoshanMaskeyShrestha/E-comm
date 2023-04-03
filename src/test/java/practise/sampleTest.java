package practise;

import org.testng.annotations.Test;

public class sampleTest{
	@Test(groups = "smoke")
	public void sample() {
		System.out.println("smoke1");
	}
	@Test(groups = {"smoke","regression"})
	public void modify() {
		System.out.println("smoke n regression");
	}

}
