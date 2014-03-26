package taskManager.util;

import taskManager.observer.ObserverType;

/**
 * interface for filter
 * for observers to get what it need from 
 * information sent by subject
 */
public interface Filter {
	
	/**
	 * if the update information is for this specific
	 * observer, return true, otherwise return false
	 * @param type - observer identification
	 */
	public boolean filter(ObserverType type);
}
