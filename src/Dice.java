

public class Dice {
	
	//attribute 
	private int numSides; 
	
	//constructor
		public Dice () { 
			setnumSides (numSides); 
	}
	
	public void setnumSides (int ns) {
		if ( ns == 4 || ns == 6 || ns == 8 || ns == 10 || ns == 12 || ns == 20) { 
		numSides = ns; 
	}
		else {
			System.out.println("Number of sides cannot be more than four; defaults to 6");
			numSides= 6; 
		}
	} 
			
	public int getnumSides (int ns) {
			return numSides; 
	}
		
	public int generateRoll () {
		 int roll = (int) (Math.random() * numSides);  
		 return roll; 
}
	public String toString () {
		return "\n Side Num" + numSides;
	}
	
} 
