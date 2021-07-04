package BasicDay1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class basicdDay1 {
	
	@Test
	public void test1(){
		System.out.println("test1");
		Assert.assertEquals(10, 10);
	}
	
	@Test
	public void test2(){
		System.out.println("test1");
		Assert.assertEquals(10, 11);
	}
	
}
