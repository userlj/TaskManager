package taskManager.subject;

import taskManager.observer.ObserverType;

/**
 * class to get and set all the parameters
 * of the observers
 */
public class ParamValues {

	public ObserverType type;

	// performance observer
	public int currentMemoryUsage = -1;
	public int currentCpuUsage = -1;
	public int totalPhysicalMemory = -1;
	public int totalCached = -1;
	
	// process observer
	public String processName = null;
	public String userName = null;
	public int cpu = -1;
	public int memory = -1;
	public String description = null;
	
	// users observer
	public String status = null;
	
	
	/**
	 * @return the observer type
	 */
	public ObserverType getType() {
		return type;
	}
	
	/**
	 * @param type the observer type to set
	 */
	public void setType(ObserverType type) {
		this.type = type;
	}
	
	/**
	 * @return processName
	 */
	public String getProcessName() {
		return processName;
	}
	
	/**
	 * set processName 
	 * @param processName 
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	
	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * set userName
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return cpu
	 */
	public int getCpu() {
		return cpu;
	}
	
	/**
	 * set cpu
	 * @param cpu
	 */
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	/**
	 * @return memory
	 */
	public int getMemory() {
		return memory;
	}
	
	/**
	 * set memory
	 * @param memory
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * set description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return currentMemoryUsage
	 */
	public int getCurrentMemoryUsage() {
		return currentMemoryUsage;
	}
	
	/**
	 * set currentMemoryUsage
	 * @param currentMemoryUsage
	 */
	public void setCurrentMemoryUsage(int currentMemoryUsage) {
		this.currentMemoryUsage = currentMemoryUsage;
	}
	
	/**
	 * @return currentCpuUsage
	 */
	public int getCurrentCpuUsage() {
		return currentCpuUsage;
	}
	
	/**
	 * set currentCpuUsage
	 * @param currentCpuUsage
	 */
	public void setCurrentCpuUsage(int currentCpuUsage) {
		this.currentCpuUsage = currentCpuUsage;
	}
	
	/**
	 * @return totalPhysicalMemory
	 */
	public int getTotalPhysicalMemory() {
		return totalPhysicalMemory;
	}
	
	/**
	 * set totalPhysicalMemory
	 * @param totalPhysicalMemory
	 */
	public void setTotalPhysicalMemory(int totalPhysicalMemory) {
		this.totalPhysicalMemory = totalPhysicalMemory;
	}
	
	/**
	 * @return totalCached
	 */
	public int getTotalCached() {
		return totalCached;
	}
	
	/**
	 * set totalCached
	 * @param totalCached
	 */
	public void setTotalCached(int totalCached) {
		this.totalCached = totalCached;
	}
	
	/**
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * set status
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
