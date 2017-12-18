package com.tech.core;

import java.io.IOException;
import java.util.TimerTask;

/**
 * 
 * @author Girdhar.Singh
 * @date November 16, 2017
 */
public class ScheduledTask extends TimerTask {
	/**
	 * 
	 * This method will will execute the findApartment method of FindApartment class
	 * 
	 * @param none
	 * @return void
	 * @throws none
	 */
	public void run() {
		try {
			FindApartment.findApartment(MainApp.searchCriteriaUrl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
