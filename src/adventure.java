import java.util.Scanner;

public class adventure {
public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);

     
     System.out.println("You see a snake. Eat it?");
     String i = sc.nextLine();
     if (i .equals ("yes")) {
    	 
    	 	System.out.println("Weel done! You see a tree. Climb it?");
    	 	i = sc.nextLine();
    	 
    	 	if (i .equals("yes")){
    		 
    		 	System.out.println("You are almost eaten by a snake. eat the pioson?");
    		 	i = sc.nextLine();
    		 	if(i .equals("yes")) {
    		 		System.out.println("You are teleported. YOU WIN!");
    		 		
    		 	}else {
    		 		System.out.println("You die of starvation.");
    		 		
    		 		
    		 	}
    	 	} else {
    	 		System.out.println("A snake bites you. You die"); 
    	 	}
    	 	} else {
    	 			System.out.println("It bites you. you die.");
    	 			System.exit(0);
     }
     
	
	
	
	
	
	
}
}
