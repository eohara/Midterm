package pkgShape;
import pkgShape.Cuboid;

public class SortByArea implements Comparable {

	
	public int compare(Cuboid a, Cuboid b) {
		
		Cuboid cub1 = (Cuboid)a;
		Cuboid cub2 = (Cuboid)b;
		
		
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
