package com.srini.test;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class SampleTest {

	@Test
	public void test(){
		List<Integer> list1 = Lists.newArrayList();
		List<Integer> list2 = Lists.newArrayList();
		list1.addAll(list2);
	}
}
