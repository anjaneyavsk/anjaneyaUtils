package com.srini.scheduler;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ScheduleThreadTest {

	private ScheduleThread scheduleThread = new ScheduleThread();

	@Test
	public void testScheduler() throws InterruptedException {
		PrintTimeSchedulerTask schedulerTask = new PrintTimeSchedulerTask();
		scheduleThread.schedule(schedulerTask, schedulerTask.getSchedule());

		PrintTimeTimerTask timerTask = new PrintTimeTimerTask();
		scheduleThread.schedule(timerTask, timerTask.getSchedule(),
				timerTask.getPeriod());

		PrintTimeExecutorTask executorTask = new PrintTimeExecutorTask();
		scheduleThread.schdule(executorTask, executorTask.getPeriod(),
				executorTask.getTimeUnit());
		// jvm should be alive to run the tasks scheduled
		Thread.sleep(10000000);
	}
}
