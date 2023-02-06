/*
 * Lili Wang
 * csce 146
 * HW 03
 */
import java.util.Scanner;
public class RobotCommandSimulatorFE {
	public static Scanner input = new Scanner(System.in);
	public static RobotManager game = new RobotManager();
	public static void main(String[] args) {			    
	        boolean playGame = true;
	        while(playGame){	        	 
	        	begin();
	        	// reset game to the initial
	        	game.reset();
	        	// read board file
	            System.out.println("Enter Board file name: ");
	            String file1 = input.nextLine();       
	            game.readFile(file1);
	            	            
	            //read commands file
	            System.out.println("Enter Robot Commands file and Let's begin our simulate: ");
	            String file2 = input.nextLine();
	            game.readCommands(file2);

	            // end game
	            System.out.println("---Game End!!!---\n \nEnter \"y\" to play again?\nEnter any other keys to quit!");
	            
	            playGame = input.nextLine().equalsIgnoreCase("y");
	        }
	        System.out.println("Goodbey");
	    }
	// method
	private static void begin() {
		 System.out.println("Welcome to Robot Simulator games!!!");
		
	}

	

}
