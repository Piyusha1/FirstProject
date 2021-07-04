package BasicDay1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class newTestCase {
	
	@Test
	public void newCase1(){
		System.out.println("New case1");
		Assert.assertEquals(45, 45);
	}
	
	@Test
	public void newCase2(){
		System.out.println("New case2");
		Assert.assertEquals(42, 42);
	}
	
	@Test
	public void newCase3(){
		System.out.println("New case3");
		Assert.assertEquals("test", "test");
	}

}
