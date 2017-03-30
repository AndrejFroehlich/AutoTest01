package froehlich;

import java.awt.Color;

import org.junit.*;

/**
 * The Class Autotest.
 */
public class Autotest {

	/**
	 * Test 1.
	 */
	@Test
	public void test1() {
		Auto a = new Auto("Nissan", Color.ORANGE, 198);

		// Testen
		Assert.assertEquals(160, a.getLeistung(), 0);
		// a.setFarbe("rot");
	}

	@Test
	public void test4() {
		Auto a = new Auto("Nissan", Color.ORANGE, -10);

		// Testen
		Assert.assertEquals(10, a.getLeistung(), 0);
		// a.setFarbe("rot");
	}

	/**
	 * Test 2.
	 */
	@Test
	public void test2() {
		Auto a = new Auto("Nissan", Color.RED, 198);
		// Testen
		Assert.assertEquals(Color.red, a.getFarbe());
	}

	/**
	 * Test 3.
	 */
	@Test
	public void test3() {
		Auto a = new Auto("Eiswagen", Color.ORANGE, 198);
		// Testen
		Assert.assertEquals("Eiswagen", a.getType());

	}

	@Test
	public void test5() {
		Auto a = new Auto("Audi", Color.WHITE, 122130);

		// Testen
		Assert.assertEquals(10, a.getLeistung(), 0);
		// a.setFarbe("rot");
	}

	@Test
	public void test6() {
		Auto a = new Auto("Audi", Color.WHITE, 1231);

		// Testen
		Assert.assertEquals("Test", a.getType(), 0);
		// a.setFarbe("rot");
	}

	@Test
	public void test7() {
		Auto a = new Auto(" ", null, -10);

		// Testen
		Assert.assertEquals(null, a.getFarbe(), 0);
		// a.setFarbe("rot");
	}

	@Test
	public void test8(){
		Auto a = new Auto(null ,null , 0);
	
		//Testen
		Assert.assertEquals(null ,a.getLeistung(),0);
		//a.setFarbe("rot");
	}

}
