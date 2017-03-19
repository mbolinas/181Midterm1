package com.cisc181.core;

public class PersonException extends Exception{
	
	
	private Person person;
	
	public PersonException(Person person){
		super();
		this.person = person;
	}
	public PersonException(Person person, String message){
		super(message);
		this.person = person;
	}
	
}
