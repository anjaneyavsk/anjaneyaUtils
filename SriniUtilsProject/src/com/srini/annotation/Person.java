package com.srini.annotation;

/**
 * 
 * @author srinivasa
 *
 */
public class Person {

	@ValidateField(doValidate = true)
	private int id;

	@ValidateField(doValidate = true)
	private String name;

	@ValidateField(doValidate = true)
	private String emailId;

	@ValidateField(doValidate = true)
	private Person p;

	/**
	 * Describes about the person
	 */
	Person() {
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param emailId
	 */
	Person(int id, String name, String emailId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

}
