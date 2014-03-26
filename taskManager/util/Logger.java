package taskManager.util;

/**
 * class for logger
 */
public class Logger {
	private static int debug_value;
	private static String message;
	
	/**
	 * @return the debug_value
	 */
	public static int getDebug_value() {
		return debug_value;
	}
	
	/**
	 * @return the message
	 */
	public static String getMessage() {
		return message;
	}


	/**
	 * @param debug_value - the debug_value to set
	 */
	public static void setDebug_value(int debug_value) {
		
		// check if debug value is out of range
		if(debug_value<0 || debug_value>4){
			throw new IllegalArgumentException("debug value should from 0 to 4.");
		}
		
		Logger.debug_value = debug_value;
	}


	// similar to setMessage
	public static void dump(String message){
		Logger.message = message;
	}


	@Override
	public String toString() {
		return "Logger []";
	}


}
