package taskManager.observer;

import taskManager.subject.Subject;
import taskManager.util.Display;
import taskManager.util.Filter;
import taskManager.util.Logger;

/**
 * class of performance observer
 */
public class PerformanceObserver implements Observer {
	
	private int currentMemoryUsage;
	private int currentCpuUsage;
	private int totalPhysicalMemory;
	private int totalCached;
	private Filter filter;
	

	/**
	 * constructor
	 * @param currentMemoryUsage
	 * @param currentCpuUsage
	 * @param totalPhysicalMemory
	 * @param totalCached
	 */
	public PerformanceObserver(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public void update(Subject s) {
		
		// if the data is to update performance observer,
		// update the data of the observer
		
		if (filter.filter(s.getPm().getType())) {
			
			this.currentMemoryUsage = s.getPm().getCurrentMemoryUsage();
			this.currentCpuUsage = s.getPm().getCurrentCpuUsage();
			this.totalPhysicalMemory = s.getPm().getTotalPhysicalMemory();
			this.totalCached = s.getPm().getTotalCached();
			
			// if debug value is 1, print the data of observer
			if(Logger.getDebug_value()==1){
				Logger.dump(this.toString());
				Display.DisplayMessage();
			}
			
		}
		
	}


	@Override
	public String toString() {
		return "PerformanceObserver [currentMemoryUsage=" + currentMemoryUsage
				+ ", currentCpuUsage=" + currentCpuUsage
				+ ", totalPhysicalMemory=" + totalPhysicalMemory
				+ ", totalCached=" + totalCached + "]";
	}

	
}
