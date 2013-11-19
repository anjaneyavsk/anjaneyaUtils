package com.srini.generics;

import java.util.Collection;

import org.apache.log4j.Logger;

public class SampleGenerics {
	Logger log = Logger.getLogger(SampleGenerics.class);
	
	public <E> void print(Collection<E> objs){
		for(E obj : objs){
			log.info(obj.toString());
		}
	}
}
