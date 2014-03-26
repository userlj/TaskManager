package taskManager.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import taskManager.subject.Subject;

/**
 *	read data from input file
 */
public class ReaderFile implements Reader{
	
	private File dataFile;
	private BufferedReader br;
	private Subject s;
	
	/**
	 * constructor
	 */
	public ReaderFile(String fileName, Subject s) {

				dataFile = new File(fileName);
				try {
					br = new BufferedReader(new FileReader(dataFile));
				} catch (FileNotFoundException e) {
					if(Logger.getDebug_value()==0){
						Logger.dump("File not found!");
						Display.DisplayMessage();
					}
					System.exit(1);
				}
				this.s = s;
				
	}
	
	
	
	@Override
	// read data from input file
	public String readFromFile(){	
		String newLine = null;
		try{
				newLine = br.readLine();	// read a line from file
				s.CheckAndSet(newLine);		// set new values to parameters
		}
		catch(IOException e)
		{
			// logger
			if(Logger.getDebug_value()==0){
				Logger.dump("Cannot read file!");
				Display.DisplayMessage();
			}
			System.exit(1);
		} 

		return newLine;
	}

}