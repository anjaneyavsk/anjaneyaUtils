package com.srini.annotation;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class ValidationServiceTest {

	private static ValidationService validationService;

	@Before
	public void setUp() {
		validationService = new ValidationService();
	}

	@Test
	public void testValidate_Person() {
		try {

			String cls = "Person";
			Class k =Class.forName(cls);
			Person person = (Person) k.newInstance();
			
			person.setP(person);
			validationService.validate(person);
		} catch (Exception e) {
			fail(e.getMessage());
		}

	}

}
