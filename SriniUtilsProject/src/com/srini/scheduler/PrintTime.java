package com.srini.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTime implements ScheduleTask {

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String cronString = "*/1 * * * *";

	@Override
	public void run() {
		System.out.println("Printing Time: " + dateFormat.format(new Date()));

	}

	@Override
	public String getSchedule() {
		return cronString;
	}

}
