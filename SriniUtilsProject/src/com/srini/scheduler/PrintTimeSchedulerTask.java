package com.srini.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class to schedule using cron expression
 * 
 * @author Srinivas Anjaneya
 * 
 */
public class PrintTimeSchedulerTask implements Runnable {

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String cronString = "*/1 * * * *";

	@Override
	public void run() {
		System.out.println("PrintTimeSchedulerTask Printing Time: "
				+ dateFormat.format(new Date()));
	}

	public String getSchedule() {
		return cronString;
	}

}
