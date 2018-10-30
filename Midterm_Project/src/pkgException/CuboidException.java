package pkgException;

import pkgShape.Cuboid;

public class CuboidException extends Exception{
	
	private Cuboid c;
	
	
	public CuboidException(Cuboid r) {
		super();
		this.c = c;
	}

	protected Cuboid getC() {
		return c;
	}
	

}
