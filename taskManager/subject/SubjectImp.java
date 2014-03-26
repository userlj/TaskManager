package taskManager.subject;

import java.util.LinkedList;

import taskManager.observer.Observer;
import taskManager.observer.ObserverType;
import taskManager.util.Display;
import taskManager.util.Logger;

public class SubjectImp implements Subject {

	// data structure to store observers that registered
	private LinkedList<Observer> observers = new LinkedList<Observer>();
	
	// all the parameters of the observers
	private ParamValues pm = new ParamValues();
	
	/**
	 * @return the pm
	 */
	public ParamValues getPm() {
		return pm;
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer element : observers)
		{
			element.update(this);
		}
	}
	
	@Override
	public void CheckAndSet(String info)
	{
		// if no more data, exit
		if (info == null) {
			System.exit(1);
		}
		
		// split data line by " "
		String data[] = info.split(" ");
		
		// the first word refer to an observer
		String val = data[0];
		ObserverType type = null;
		
		// check the type of observer
		if (val.equals(ObserverType.Performance.toString())) {
			type = ObserverType.Performance;
			
		} else if (val.equals(ObserverType.Processes.toString())) {
			type = ObserverType.Processes;
			
		} else if (val.equals(ObserverType.Users.toString())){
			type = ObserverType.Users;
			
		} else {
			
			// if observer is not in registered list, exit
			if(Logger.getDebug_value()==0){
				Logger.dump("Unknown observer type!");
				Display.DisplayMessage();
			}
			System.exit(1);
			
		}
		
		// set parameters that changed
		switch(type)
		{
			case Processes :  	pm.setType(type);
								pm.setProcessName(data[1]);
								pm.setUserName(data[2]);
								pm.setCpu(Integer.parseInt(data[3]));
								pm.setDescription(data[4]);
								break;
								
			case Performance: 	pm.setType(type);
								pm.setCurrentMemoryUsage(Integer.parseInt(data[1]));
							   	pm.setCurrentCpuUsage(Integer.parseInt(data[2]));
							   	pm.setTotalPhysicalMemory(Integer.parseInt(data[3]));
							   	pm.setTotalCached(Integer.parseInt(data[4]));
							   	break;
							   
			case Users: 		pm.setType(type);
								pm.setUserName(data[1]);
						  		pm.setStatus(data[2]);
						  		break;
						  		
			default:			break;
		}
		
		notifyObservers();	// notify all the registered observers
			
	}
	
}
	
