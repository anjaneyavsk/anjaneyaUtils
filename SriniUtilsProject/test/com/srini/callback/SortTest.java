package com.srini.callback;

import org.apache.log4j.Logger;
import org.junit.Test;

public class SortTest {

	Logger log = Logger.getLogger(SortTest.class);

	@Test
	public void testGetName() {
		Sort sort = new Sort() {
			public String getName() {
				return "Hello World";
			}
		};
		String name = sort.getName();

		log.info(name);
	}

}
