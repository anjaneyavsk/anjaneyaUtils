package com.srini.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Class to schedule using cron expression
 * 
 * @author Srinivas Anjaneya
 * 
 */
public class PrintTimeExecutorTask implements Runnable {

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	long period = 1;

	@Override
	public void run() {
		System.out.println("PrintTimeExecutorTask Printing Time: "
				+ dateFormat.format(new Date()));
	}

	public long getPeriod() {
		return period;
	}

	public TimeUnit getTimeUnit() {
		return TimeUnit.MINUTES;
	}
}
