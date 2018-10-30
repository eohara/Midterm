package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	

	@Test
	public void RectangleTest1() {
		
		Rectangle r = new Rectangle(3, 4);
		System.out.println(r);
	
	}
	@Test
	public void Rectangle_getiLength_Test() {
		
		Rectangle r = new Rectangle(3, 4);
		double recLength = r.getiLength();
		double tester = 4;

		assertTrue(recLength == tester);
	
	}
	@Test
	public void Rectangle_getiWidth_Test() {
		
		Rectangle r = new Rectangle(3, 4);
		double recWidth = r.getiWidth();
		double tester = 3;

		assertTrue(recWidth == tester);
	
	}

	@Test
	public void RectangleAreaTest() {

		Rectangle r = new Rectangle(4, 5);
		
		double recArea = r.area();
		double tester = 20;
		
	
		assertTrue(recArea == tester);
		
	}
	
	@Test
	public void RectanglePerimeterTest() {

		Rectangle r = new Rectangle(8, 4);
	
		
		double recPerimeter = r.perimeter();
		double tester = 24;
		
	
		assertTrue(recPerimeter == tester);	

}
	
	/*@Test
	public void Rectangle_GreaterThan_CompareTest() {

		Rectangle rec1 = new Rectangle(2, 2);
		Rectangle rec2 = new Rectangle(1, 1);
		
		double area = rec1.area();
		
		double result = area.compareTo(rec2.area());
		
		assertTrue(result >= 1);
		
		}
*/
	
	
	
	
	
	
}
