
public class LoadedDice extends Dice {
		
	public LoadedDice () {
		super (); 
	}
	
	//generate odd number 
	public int generateRoll () {
	int firstNum = (int) (Math.random () * 100) +1;
	if (firstNum <= 80) { 
		int allNumRoll = (int) (Math.random () *getnumSides()) +1;
		int roll = allNumRoll *2 - 1; 
		return roll;
		}
	else { 
		int allNumRoll = (int) (Math.random()* getnumSides()) +1;
		int roll = allNumRoll *2;
		return roll;
	}

	}
}
