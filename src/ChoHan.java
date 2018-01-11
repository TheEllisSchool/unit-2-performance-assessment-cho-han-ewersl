import javax.swing.JOptionPane;

public class ChoHan {
	
	public static void main(String[] args) {
		int p1Points = 0; 
		int p2Points = 0; 
		
		int roll1 = 0; 
		int roll2 = 0; 
		
		for (int i=0; i <5; i++ ) { 
			int evenOrOdd = (int) (Math.random ()* 2)+ 1;
			if (evenOrOdd== 1) {
				roll regD = new roll (); 
				roll1 = regD.generateRoll();
			}
			else {
				loadedDie loadD= new loadedDie (); 
				roll1= loadD.generateRoll(); 
			}
			int evenOrOdd2 = (int) (Math.random()* 2) + 1;
			if (evenOrOdd2 == 1) {
				roll regD2 = new roll ();
				roll2 = regD2.generateroll(); 
			}
			else {
				loadedDie loadD2 = new loadedDie (); 
				roll2 = loadD2.generateRoll(); 
			}
		String choorhan;
		// even for cho and then odd for Han 
		if ((roll1 + roll2) %2==0) {
			choorhan = "Cho" ;
		}
		else {
			choorhan= "Han"; 
		}
		
		String player1 = JOptionPane.showInputDialog("hey player 1: Cho or Han?"); 
		String player2= JOptionPane.showInputDialog("hello player 2: Cho or Han? ");
			if (player1.equals(chooorhan)) {
				p1Points++;
				JOptionPane.showMessageDialog(null, "Nice guess! You are #mafiabound! Player one's total is: " + p1Points);
			} else {
				JOptionPane.showMessageDialog(null, "Player 1 is wrong");
			}
			if (player2.equals(choorhan)) {
				p2Points++; 
				JOptionPane.showMessageDialog(null, "Steller guess! You would do fab in the mafia! Player two's total is:" + p2Points);
			} else {
				JOptionPane.showMessageDialog(null, "Player 2 is wrong");
			}
		

		}

	}
}
