package com.srini.thread.pool;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import com.google.common.collect.Lists;

/**
 * Implementation of Thread pool.
 * 
 * @author srinivas anjaneya
 * 
 */
public class ThreadPool {

	private static Queue<Task> queue = new LinkedBlockingQueue<Task>();
	private List<PoolThread> threads = Lists.newArrayList();
	public static boolean isRunning = false;

	/**
	 * Creating {@paramref maxThreads} {@link PoolThread} and starting them
	 * 
	 * @param maxThreads
	 */
	ThreadPool(int maxThreads) {
		for (int i = 0; i < maxThreads; i++) {
			PoolThread t = new PoolThread(queue, String.valueOf(i + 1));
			threads.add(t);
		}
		for (Thread t : threads) {
			t.start();
		}
		isRunning = true;
	}

	/**
	 * Method to put the task in queue.
	 * 
	 * @param task
	 * @throws Exception
	 */
	public static void executeTask(Task task) throws Exception {

		if (!isRunning)
			throw new Exception("Thread pool has not been initiated");
		synchronized (queue) {
			queue.add(task);
			queue.notifyAll();
		}
	}

	/**
	 * Method to execute the task. Used by {@link PoolThread}
	 * 
	 * @return
	 * @throws Exception
	 */
	protected static Task fetchTask() throws Exception {
		if (!isRunning)
			throw new Exception("Thread pool has not been initiated");
		Task task = null;
		synchronized (queue) {
			while (queue.size() == 0) {
				System.out.println("Waiting for task");
				queue.wait();
			}
			task = queue.remove();
			queue.notifyAll();
			System.out.println("Got task!!!!");
		}
		return task;
	}

	/**
	 * Sets isRunning = false, So threads (<{@link PoolThread}>) in the pool
	 * will automatically exists
	 */
	public void stop() {
		isRunning = false;
	}

	@Override
	protected void finalize() throws Throwable {
		stop();
		super.finalize();
	}

}
