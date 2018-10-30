package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {

	@Test
	public void CuboidTest1() {
		Cuboid c = new Cuboid(3, 4, 2);
		System.out.println(c);
	}

	@Test
	public void Cuboid_getiDepth_Test() {
		Cuboid c = new Cuboid(3, 4, 2);
		double cubDepth = c.getiDepth();
		double tester = 2;

		assertTrue(cubDepth == tester);
	}
	@Test
	public void Cuboid_area_Test() {
		Cuboid c = new Cuboid(3, 4, 2);
		double cubArea = c.area();
		double tester = 96;

		assertTrue(cubArea == tester);
	}
	
	@Test
	public void Cuboid_volume_Test() {
		Cuboid c = new Cuboid(3, 4, 2);
		double cubVolume = c.volume();
		double tester = 24;

		assertTrue(cubVolume == tester);
	
	}
	
	@Test
	public void testUnsupportedOperationException() throws Exception {
	 
	Cuboid c = new Cuboid(3, 4, 2);
	boolean thrown = false;

	try {
	    c.perimeter();
	  } 
	  catch (UnsupportedOperationException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}

}
