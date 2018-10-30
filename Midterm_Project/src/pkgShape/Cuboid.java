package pkgShape;

import pkgException.CuboidException;

public class Cuboid extends Rectangle {
	
	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
		
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	@Override 
	public double area() {
		
		return (iDepth * super.getiWidth() * super.getiLength()) * 4; 
		
	}
	
	public double volume() {
	
		return iDepth * super.getiWidth() * super.getiLength();
		
	}
	
	/* public double perimeter() throws Exception {
		
		if (Cuboid.perimeter() != 0)
		{
			throw new RectangleException(this);
		}
		return perimeter.remove(0);

	}
	
	}*/
	

}
