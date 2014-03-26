package taskManager.util;

/**
 * class for display data
 */
public class Display {
	
	/**
	 * print message corresponding to debug value
	 */
	public static void DisplayMessage () {
		
		String message = Logger.getMessage();
		
		// if message is not null, print it
		if (message != null) {
			System.out.println(message);
		}
		
	}
	
}
