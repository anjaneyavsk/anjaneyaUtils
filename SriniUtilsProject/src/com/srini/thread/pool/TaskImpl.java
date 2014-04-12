package com.srini.thread.pool;

public class TaskImpl implements Task {

	private String name;
	
	TaskImpl(String name){
		this.name = name;
	}
	@Override
	public void execute() throws InterruptedException {
		System.out.println("Executing Task " + name);
		/*for(int i = 0; i < Integer.MAX_VALUE; i++){
			//for(int j = 0; j < 100; j++);
			//do nothing
		}*/
		//this.wait();
		//Thread.currentThread().sleep(1000);
		System.out.println("Completed Task " + name);
	}
	@Override
	public String getName() {
		return name;
	}

}
