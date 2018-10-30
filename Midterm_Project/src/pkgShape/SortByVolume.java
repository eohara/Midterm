package pkgShape;

import pkgShape.Cuboid;
public class SortByVolume implements Comparable {

	public int compare(Cuboid a, Cuboid b) {
			
		Cuboid cub1 = (Cuboid)a;
		Cuboid cub2 = (Cuboid)b;
			
			
		double thisVolume = this.volume();
		double otherVolume = r.volume();
		
			
		if 
			
		(thisVolume > otherVolume) {
			return 1;
		}
					
		else if (thisVolume == otherVolume) {
			return 0;
		}
				
		else {
			return -1;
		}
					
							
	}

		

	}

	
	

}
