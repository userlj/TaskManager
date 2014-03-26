package taskManager.driver;

import java.io.IOException;

import taskManager.observer.Observer;
import taskManager.observer.ObserverType;
import taskManager.observer.PerformanceObserver;
import taskManager.observer.ProcessObserver;
import taskManager.observer.UsersObserver;
import taskManager.subject.Subject;
import taskManager.subject.SubjectImp;
import taskManager.util.Display;
import taskManager.util.FilterImp;
import taskManager.util.Filter;
import taskManager.util.Logger;
import taskManager.util.Reader;
import taskManager.util.ReaderFile;

/**
 * Driver class
 */
public class Driver {

	public static void main(String[] args) throws IOException {

		Subject s = new SubjectImp();
		
		Filter filterPer = new FilterImp(ObserverType.Performance);
		Observer performance = new PerformanceObserver(filterPer);
		
		Filter filterPro = new FilterImp(ObserverType.Processes);
		Observer process = new ProcessObserver(filterPro);
		
		Filter filterU = new FilterImp(ObserverType.Users);
		Observer users = new UsersObserver(filterU);
		
		s.registerObserver(performance);
		s.registerObserver(process);
		s.registerObserver(users);
		
		
		String fileName = args[0];
		Reader reader = new ReaderFile(fileName, s);
		
		int debug_value = Integer.parseInt(args[1]);
		Logger.setDebug_value(debug_value);
		
		while((reader.readFromFile())!=null) {
			reader.readFromFile();
			Display.DisplayMessage(); 
		}
		
		
	}

}
