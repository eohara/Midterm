package pkgException;

import pkgShape.Cuboid;

public class CuboidException extends Exception{
	
	private Cuboid c;
	
	
	public CuboidException(Cuboid cuboid) {
		
	}
		

	public void UnsupportedOperationException(Cuboid c) {
		this.c = c;
	}

	protected Cuboid getC() {
		return c;
	}
	

}
