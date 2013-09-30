package com.srini.scheduler;

import it.sauronsoftware.cron4j.Scheduler;

public class ScheduleThread {
	  private Scheduler scheduler;
	
	<T extends ScheduleTask> ScheduleThread( T t){
		scheduler = new Scheduler();
		scheduler.schedule(t.getSchedule(), t);
		scheduler.start();
	}
}
