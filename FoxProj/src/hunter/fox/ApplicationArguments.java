package hunter.fox;

/**
 * @author Hunter
 */
public class ApplicationArguments {
	
	public static boolean parseArguments(String[] args) {
		if (args.length <= 0)
			return true;
		
		for(String s : args) {
			if (s.equalsIgnoreCase("help"))
				return displayHelp();
		}
		
		return true;
	}
	
	/**
	 * The help option tells the user some information about the program and the version.
	 * There is currently no information about commands as none exist at this time.
	 * TODO Update options when options become important.
	 * 
	 * @return False, the program should not execute after this argument is called.
	 */
	public static boolean displayHelp() {
		//I understand this is a sub optimal design idea.
		String help = String.format("%s is a game developed by Hunter as a learning/passion project.\n"
				+ "Game version %s.",
				GameOptions.getName(),
				GameOptions.getVersion());
		System.out.println(help);
		return false;
	}
	
	
}
