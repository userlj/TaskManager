package taskManager.util;

import taskManager.observer.ObserverType;

/**
 * implementation of filter
 */
public class FilterImp implements Filter {

	ObserverType type;
	
	/**
	 * @param type - observer type
	 */
	public FilterImp(ObserverType type) {
		super();
		this.type = type;
	}

	@Override
	public boolean filter(ObserverType type) {
		if (this.type == type) {
			return true;
		} else {
			return false;
		}
	}
}
