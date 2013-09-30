package com.srini.classloader;

import java.util.ArrayList;
import java.util.List;

import com.srini.generics.SampleGenerics;

public class SampleClassLoader {

	public void doSomething() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		Class klass = Class.forName("com.srini.generics.SampleGenerics");
		ClassLoader.getSystemClassLoader().loadClass("com.srini.generics.SampleGenerics");
		SampleGenerics sampleGenerics = (SampleGenerics) klass.newInstance();
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		sampleGenerics.print(integerList);
	}

}
