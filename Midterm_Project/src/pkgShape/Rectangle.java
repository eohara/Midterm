package pkgShape;


public class Rectangle extends Shape implements Comparable{
	
	private int iWidth;
	private int iLength;
	

	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	
	public int getiWidth() {
		return iWidth;
	}


	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}


	public int getiLength() {
		return iLength;
	}


	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	@Override
	public double area() {
		
		return iLength * iWidth;
		
	}

	@Override
	public double perimeter() {
		
		return 2 * iLength + 2 * iWidth;
	}

	@Override
	public int compareTo(Object o) {
		
		Rectangle r = (Rectangle)o;
		
		if (o instanceof Rectangle) {
			
			System.out.println("o is a rectangle");
		}
		else {
			System.out.println("o is not a rectangle");
		}
				
		double thisArea = this.area();
		double otherArea = r.area();
				
				
		if 
		
		(thisArea > otherArea) {
			return 1;
		}
				
		else if (thisArea == otherArea) {
			return 0;
		}
				
		else {
			return -1;
		}
				
						
	}

}
