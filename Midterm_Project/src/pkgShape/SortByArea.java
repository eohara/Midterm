package pkgShape;
import pkgShape.Cuboid;
import pkgShape.Rectangle;


public class SortByArea implements Comparable {

	@Override
	public int compareTo(Object o) {
		Cuboid c = (Cuboid)o;
			
		//Check to see if object o is a cuboid
		if (o instanceof Cuboid) {
				
			System.out.println("o is a Cuboid");
		}
			
		else {
			System.out.println("o is not a Cuboid");
			}
			
			double thisArea = Cuboid().area();
			double otherArea = c.area();
		
			
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

		
		
		public int compare(Cuboid a, Cuboid b) {
			
			int result = a.compareTo(b);
			
				
			if (result > 0) {
				return 1;
			}
						
			else if (result == 0) {
				return 0;
			}
					
			else {
				return -1;
			}
						
								
		}

				
						
	}

	


