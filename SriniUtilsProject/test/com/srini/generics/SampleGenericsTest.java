package com.srini.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SampleGenericsTest {

	public SampleGenerics sampleGenerics;
	
	@Before
	public void onSetup(){
		sampleGenerics = new SampleGenerics();
	}
	
	@Test
	public void testPrint(){
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		sampleGenerics.print(integerList);
		
		Set<String> stringList = new HashSet<String>();
		stringList.add("hello");
		stringList.add("world");
		sampleGenerics.print(stringList);
	}

}
