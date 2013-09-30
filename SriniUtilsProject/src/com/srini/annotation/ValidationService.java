package com.srini.annotation;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;

import org.apache.log4j.Logger;

public class ValidationService {
	Logger log = Logger.getLogger(ValidationService.class);

	public void validate(Object obj) throws Exception {
		validate(obj, new HashSet<Object>());
	}

	private void validate(Object obj, Collection<Object> circularObjects)
			throws IllegalAccessException, Exception {
		if (circularObjects.contains(obj))
			return;
		circularObjects.add(obj);
		log.info("Validating obj " + obj.getClass().getName());
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			Object fieldValue = field.get(obj);
			ValidateField validateAnnoation = field
					.getAnnotation(ValidateField.class);
			if (validateAnnoation != null && validateAnnoation.doValidate()) {
				if (fieldValue instanceof Integer) {
					validate((Integer) fieldValue);
				} else if (fieldValue instanceof String) {
					validate((String) fieldValue);
				} else {
					validate(fieldValue, circularObjects);
				}
			}
		}
	}

	public void validate(Integer value) throws Exception {
		if (value <= 0) {
			throw new Exception("Integer value cant be zero");
		}
	}

	public void validate(String value) throws Exception {
		if (value == null || value.isEmpty()) {
			throw new Exception("String value cant be empty or null");
		}
	}
}
