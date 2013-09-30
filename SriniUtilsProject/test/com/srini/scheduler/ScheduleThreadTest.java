package com.srini.scheduler;

import org.junit.Test;

public class ScheduleThreadTest {

	private ScheduleThread scheduleThread;
	
	@Test
	public void testScheduler() throws InterruptedException{
		scheduleThread = new ScheduleThread(new PrintTime());
		//Thread.sleep(10000000);
	}
}
