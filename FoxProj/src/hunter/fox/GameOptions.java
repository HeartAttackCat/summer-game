package hunter.fox;

/**
 * @author Hunter
 */
public class GameOptions {
	/**
	 * This holds the name and the version when referenced.
	 * This should be avoided from changing or touching, as this may be used as
	 * determining and connecting clients to a server.
	 * 
	 * These values also cannot be changed... disasters aren't favored.
	 */
	private static final String version = "Indev-0.1";
	private static final String name = "Summer Project";
	
	/**
	 * Display dimensions.
	 * Width of terminal.
	 * Height of terminal.
	 */
	public static int height = 20;
	public static int width = 40;
	
	public static int getHeight() {
		return height;
	}
	
	public static void setHeight(int height) {
		GameOptions.height = height;
	}
	
	public static int getWidth() {
		return width;
	}
	
	public static void setWidth(int width) {
		GameOptions.width = width;
	}
	
	public static String getVersion() {
		return version;
	}
	
	public static String getName() {
		return name;
	}
}
