package taskManager.observer;


import taskManager.subject.Subject;
import taskManager.util.Filter;
import taskManager.util.Logger;

/**
 * class of process observer
 */
public class ProcessObserver implements Observer {
	private String processName;
	private String userName;
	private int cpu;
	private int memory;
	private String description;
	private Filter filter;
	
	/**
	 * constructor
	 * @param processName
	 * @param userName
	 * @param cpu
	 * @param memory
	 * @param description
	 */
	public ProcessObserver(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public void update(Subject s) {
		
		// if the data is to update process observer,
		// update the data of the observer
		
		if (filter.filter(s.getPm().getType())) {
			
			this.processName = s.getPm().getProcessName();
			this.userName = s.getPm().getUserName();
			this.cpu = s.getPm().getCpu();
			this.memory = s.getPm().getMemory();
			this.description = s.getPm().getDescription();
			
			// if debug value is 1, print the data of observer
			if(Logger.getDebug_value()==1){
				Logger.dump(this.toString());
			}
		}
	}
	
	@Override
	public String toString() {
		return "ProcessObserver [processName=" + processName + ", userName="
				+ userName + ", cpu=" + cpu + ", memory=" + memory
				+ ", description=" + description + "]";
	}
	

}
