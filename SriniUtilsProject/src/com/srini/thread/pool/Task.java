package com.srini.thread.pool;

/**
 * 
 * Interface of tasks executed by {@link ThreadPool}.
 * Use the interface to implement the tasks and call {@link ThreadPool.executeTask90}
 * 
 * @author srinivas anjaneya
 *
 */
public interface Task {

	public void execute() throws InterruptedException;
	public String getName();
}
