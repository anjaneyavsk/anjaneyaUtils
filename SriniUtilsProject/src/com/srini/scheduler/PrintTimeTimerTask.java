package com.srini.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimerTask;

/**
 * Class to Schedule using Timer Task
 *
 * @author Srinivas Anjaneya 
 *
 */
public class PrintTimeTimerTask extends TimerTask {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	GregorianCalendar calender = new GregorianCalendar();
	int period = 1000; //in milliseconds

	@Override
	public void run() {
		System.out.println("PrintTimeTimerTask Printing Time: " + dateFormat.format(new Date()));
	}

	public Date getSchedule() {
		calender.add(GregorianCalendar.MINUTE, period/1000);
		return calender.getTime();
	}

	public int getPeriod() {
		return period;
	}
}
