import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to your ?" + pet, "Hmmm", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "FEED", "FEed", "feed"}, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

			
			if (task == 2) {
				feed();
				
			}
if (task == 1) {
	FEed();			
				
			}
if (task == 0) {
	FEED();

}

if (happinessLevel == 30) {
	JOptionPane.showMessageDialog(null, "YOU WIN");
	System.exit(0);
}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void FEed() {
		JOptionPane.showMessageDialog(null, "...               Your pet in happy");
		happinessLevel += 10;
	}
	
	static void FEED() {
		JOptionPane.showMessageDialog(null, "BLAAAAAAAA-               Your pet has barfed");
		happinessLevel -= 10;
	}
	static void feed() {
		JOptionPane.showMessageDialog(null, "GRRRRRRR               Your pet is angry!");
		happinessLevel -= 10;
	}
	
	
	
}
