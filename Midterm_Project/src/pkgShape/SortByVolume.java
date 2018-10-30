package pkgShape;

import pkgShape.Cuboid;
public class SortByVolume implements Comparable {

	@Override
	public int compareTo(Object o) {
		Cuboid c = (Cuboid)o;
		
		//Check to see if object o is a rectangle
		if (o instanceof Cuboid) {
			
			System.out.println("o is a Cuboid");
		}
		
		else {
			System.out.println("o is not a Cuboid");
		}
		
		double thisVolume = Cuboid().volume();
		double otherVolume = c.volume();
	
		
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

	
	


