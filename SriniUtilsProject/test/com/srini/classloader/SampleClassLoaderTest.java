package com.srini.classloader;

import org.junit.Before;
import org.junit.Test;

public class SampleClassLoaderTest {
	
	public SampleClassLoader sampleClassLoader;
	
	
	@Before
	public void onSetup(){
		sampleClassLoader = new SampleClassLoader();
	}
	
	@Test
	public void testDoSomething() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		sampleClassLoader.doSomething();
	}

}
