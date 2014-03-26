package taskManager.observer;

import taskManager.subject.Subject;

/**
 *	interface for observers
 */
public interface Observer {
	
	/**
	 * update data after get data from subject
	 * @param s - subject object passed by subject
	 */
	public void update(Subject s);
}
