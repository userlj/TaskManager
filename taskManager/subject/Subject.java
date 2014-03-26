package taskManager.subject;

import taskManager.observer.Observer;

/**
 * interface for subject
 */
public interface Subject {
	
	/**
	 * register an observer to subject
	 * @param o - observer that to be registered
	 */
	void registerObserver(Observer o);
	
	/**
	 * remove a registered observer
	 * @param o - observer that to be removed
	 */
	void removeObserver(Observer o);
	
	/**
	 * notify all the observers
	 */
	void notifyObservers();
	
	/**
	 * get all the parameters
	 * @return object of ParamValues
	 */
	ParamValues getPm();
	
	/**
	 * read information from file and assign parameters
	 * @param info
	 */
	void CheckAndSet(String info);
}
