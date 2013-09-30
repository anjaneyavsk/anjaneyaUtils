package com.srini.garbage.collection;

import org.apache.log4j.Logger;

public class SampleGC {
	private static Logger log = Logger.getLogger(SampleGC.class);

	@Override
	public void finalize() {
		log.info("Finalize method is called in Object : "
				+ this.getClass().getName());
	}

}
