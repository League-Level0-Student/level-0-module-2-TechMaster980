import javax.swing.JOptionPane;

public class relationcheckpoint {
	public static void main(String[] args) {
		
	

	
		//1. Ask the user how many cups of flour they have. If they have less than 2 cups, tell
		//them to go to the store to buy more.
		
		String cup = JOptionPane.showInputDialog("how many cups do you have");
		int cup1 = Integer.parseInt(cup);
		if(cup1 < 2) {
		JOptionPane.showMessageDialog(null, "BUY MORE fLOUR!");
		}
		//2. Now ask them how many people they are going to give cookies to. If they are going
		//to give cookies to more than 30 people, tell them they are going to have to bake two
		// of cookies! 
		String people = JOptionPane.showInputDialog("how many people are you going to give cookies to");
		int people1 = Integer.parseInt(cup);
		if(people1 > 30) {
		JOptionPane.showMessageDialog(null, "bake two cookies");
		}
		
		//3. Finally, ask them how many batches of cookies they baked. If they baked 2 batches
		//of cookies, tell them they are lucky to have so many friends. 
		String friends = JOptionPane.showInputDialog("how many batches of cookies are you going to bake");
		int friends1 = Integer.parseInt(cup);
		if(friends1 == 2) {
		JOptionPane.showMessageDialog(null, "you are lucky to have friends");
		}
		
	}

}

