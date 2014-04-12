package com.srini.thread.pool;

import java.util.Queue;

/**
 * Implementation of Thread used in {@link ThreadPool}
 * @author srinivasa
 *
 */
public class PoolThread extends Thread {

	private Queue<Task> queue = null;

	public PoolThread(Queue<Task> queue, String name) {
		System.out.println("Creating Thread " + name);
		this.queue = queue;
		this.setName(name);
	}

	public void run() {
		System.out.println("Starting Thread " + this.getName());
		while (ThreadPool.isRunning) {
			System.out.println("Waiting for Tasks " + this.getName());

			try {
				Task task = ThreadPool.fetchTask();
				System.out.println("Starting Task " + task.getName()
						+ " By Thread " + this.getName());
				task.execute();
			} catch (InterruptedException e) {
				// Ignoring exception
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
