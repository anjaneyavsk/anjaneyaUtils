package com.srini.thread.pool;

import org.junit.Test;

public class ThreadPoolTest {

	@Test
	public void testThreadPool() throws Exception {
		ThreadPool threadPool = new ThreadPool(3);
		Task t1 = new TaskImpl("T1");
		Task t2 = new TaskImpl("T2");
		Task t3 = new TaskImpl("T3");
		Task t4 = new TaskImpl("T4");
		Task t5 = new TaskImpl("T5");
		Task t6 = new TaskImpl("T6");
		Task t7 = new TaskImpl("T7");
		Task t8 = new TaskImpl("T8");
		Task t9 = new TaskImpl("T9");
		Task t10 = new TaskImpl("T10");
		threadPool.executeTask(t1);
		threadPool.executeTask(t2);
		threadPool.executeTask(t3);
		threadPool.executeTask(t4);
		threadPool.executeTask(t5);
		threadPool.executeTask(t6);
		threadPool.executeTask(t7);
		threadPool.executeTask(t8);
		threadPool.executeTask(t9);
		threadPool.executeTask(t10);
		Thread.currentThread().sleep(1000000);
	}

}
