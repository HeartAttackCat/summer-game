package hunter.fox;

/**
 * @author Hunter
 */
public class Application {
	
	public static void main(String[] args) {
		//Handle program arguments.
		boolean run = ApplicationArguments.parseArguments(args);
		
		//The argument selected by the user does not allow the game to execute further.
		if (run == false)
			return;
		
		System.out.println("Hello world!");
	}
}
