package com.srini.garbage.collection;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

import org.apache.log4j.Logger;
import org.junit.Test;

public class SampleGCTest {
	private static Logger log = Logger.getLogger(SampleGCTest.class);

	@Test
	public void testGC_finalizeMethod() throws InterruptedException {
		SampleGC sampleGC = new SampleGC();
		sampleGC = null;
		log.info(ManagementFactory.getOperatingSystemMXBean().toString());
		MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
		log.info(mbean.getHeapMemoryUsage().toString());

		System.gc();
		Thread.sleep(1000);
		mbean = ManagementFactory.getMemoryMXBean();
		log.info(mbean.getHeapMemoryUsage().toString());
		log.info("GC is completed");
	}
}
