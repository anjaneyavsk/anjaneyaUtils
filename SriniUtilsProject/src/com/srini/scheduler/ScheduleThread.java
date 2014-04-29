package com.srini.scheduler;

import it.sauronsoftware.cron4j.Scheduler;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Schedule threads using different APIs
 * 
 * @author Srinivas Anjaneya
 * 
 */
public class ScheduleThread {

	ScheduleThread() {
	}

	/**
	 * Schudule using {@link Scheduler}
	 * 
	 * @param r
	 *            runnable task to be executed
	 * @param cronExpression
	 *            schdule time in the form of expression
	 */
	public void schedule(Runnable r, String cronExpression) {
		Scheduler scheduler = new Scheduler();
		scheduler.schedule(cronExpression, r);
		scheduler.start();
	}

	/**
	 * Schedule using {@link Timer}
	 * 
	 * @param t
	 *            Timer task to be executed
	 * @param date
	 *            date to start the task
	 * @param period
	 *            interval between the execution
	 */
	public void schedule(TimerTask t, Date date, int period) {
		Timer timer = new Timer();
		timer.schedule(t, date, period);
	}

	/**
	 * Schedule using @ ScheduledExecutorService}
	 * 
	 * @param r
	 *            Runnable to be executed
	 * @param delay
	 *            period between multiple executions
	 * @param unit
	 *            type of period example: Minutes, Seconds
	 */
	public void schdule(Runnable r, long delay, TimeUnit unit) {
		ScheduledExecutorService scheduler = Executors
				.newSingleThreadScheduledExecutor();
		// you may use multiple Threads executor like
		// Executors.newScheduledThreadPool(5);
		scheduler.schedule(r, delay, unit);
	}
}