package taskManager.observer;

import taskManager.subject.Subject;
import taskManager.util.Filter;
import taskManager.util.Logger;

/**
 * class of users observer
 */
public class UsersObserver implements Observer {
	private String userName;
	private String status;
	private Filter filter;
	
	/**
	 * constructor
	 * @param userName
	 * @param status
	 */
	public UsersObserver(Filter filter) {

		this.filter = filter;
	
	}
	
	@Override
	public void update(Subject s) {
		
		// if the data is to update process observer,
		// update the data of the observer
		
		if (filter.filter(s.getPm().getType())) {

			this.userName = s.getPm().getUserName();
			this.status = s.getPm().getStatus();
			
			// if debug value is 1, print the data of observer
			if(Logger.getDebug_value()==1){
				Logger.dump(this.toString());
			}
		}
	}

	@Override
	public String toString() {
		return "UsersObserver [userName=" + userName + ", status=" + status
				+ "]";
	}	
}
