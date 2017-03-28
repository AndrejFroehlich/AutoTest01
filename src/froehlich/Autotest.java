package froehlich;

import org.junit.*;
public class Autotest {

	@Test
	public void test1(){
		Auto a = new Auto();
		a.setPs(123);
		//Testen
		Assert.assertEquals(123,a.getPs(),0);
		//a.setFarbe("rot");
	}
	
	@Test
	public void test2(){
		Auto a = new Auto();
		a.setFarbe("rot");
		//Testen
		Assert.assertEquals("rot",a.getFarbe());
	}
	
	@Test
	public void test3(){
		Auto a = new Auto("Violett", 156, "Nissan GTR");
		//Testen
		Assert.assertEquals("Nissan GTR", a.getModel());
	}
	
	
	
}
