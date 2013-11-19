package com.srini.XSLT;

import java.io.FileInputStream;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import jxl.read.biff.File;

import org.junit.Test;

public class SampleXSLTransformerTest {

	@Test
	public void testTransform() throws TransformerConfigurationException,
			TransformerException {
		String dataXML = "./data/language.xml";
		String inputXSL = "./data/language.xsl";
		String outputHTML = "./data/language.html";

		SampleXSLTransformer.transform(dataXML, inputXSL, outputHTML);
	}
}
